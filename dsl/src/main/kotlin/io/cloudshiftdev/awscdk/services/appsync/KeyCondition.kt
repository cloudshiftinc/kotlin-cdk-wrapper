package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class KeyCondition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.KeyCondition,
) {
  /**
   * Conjunction between two conditions.
   *
   * @param keyCond 
   */
  public open fun and(keyCond: KeyCondition): KeyCondition =
      unwrap(this).and(keyCond.let(KeyCondition::unwrap)).let(KeyCondition::wrap)

  /**
   * Renders the key condition to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  public companion object {
    public fun beginsWith(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.beginsWith(keyName,
        arg).let(KeyCondition::wrap)

    public fun between(
      keyName: String,
      arg1: String,
      arg2: String,
    ): KeyCondition = software.amazon.awscdk.services.appsync.KeyCondition.between(keyName, arg1,
        arg2).let(KeyCondition::wrap)

    public fun eq(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.eq(keyName,
        arg).let(KeyCondition::wrap)

    public fun ge(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.ge(keyName,
        arg).let(KeyCondition::wrap)

    public fun gt(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.gt(keyName,
        arg).let(KeyCondition::wrap)

    public fun le(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.le(keyName,
        arg).let(KeyCondition::wrap)

    public fun lt(keyName: String, arg: String): KeyCondition =
        software.amazon.awscdk.services.appsync.KeyCondition.lt(keyName,
        arg).let(KeyCondition::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.KeyCondition): KeyCondition
        = KeyCondition(cdkObject)

    internal fun unwrap(wrapped: KeyCondition): software.amazon.awscdk.services.appsync.KeyCondition
        = wrapped.cdkObject
  }
}
