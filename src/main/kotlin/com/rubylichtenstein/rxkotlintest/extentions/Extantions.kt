package com.rubylichtenstein.rxkotlintest.extentions

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.observers.TestObserver
import java.util.concurrent.TimeUnit


fun <T> Maybe<T>.test(action: (TestObserver<T>) -> Unit): TestObserver<T> = test().apply(action)
fun <T> Single<T>.test(action: (TestObserver<T>) -> Unit): TestObserver<T> = test().apply(action)
fun <T> Observable<T>.test(action: (TestObserver<T>) -> Unit): TestObserver<T> = test().apply(action)
fun Completable.test(action: (TestObserver<Void>) -> Unit): TestObserver<Void> = test().apply(action)

