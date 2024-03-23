@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Lazily produce a value.
 *
 * Can be used to return a string, list or numeric value whose actual value
 * will only be calculated later, during synthesis.
 */
public open class Lazy(
  cdkObject: software.amazon.awscdk.Lazy,
) : CdkObject(cdkObject) {
  public companion object {
    public fun any(producer: IStableAnyProducer): IResolvable =
        software.amazon.awscdk.Lazy.any(producer.let(IStableAnyProducer::unwrap)).let(IResolvable::wrap)

    public fun any(producer: IStableAnyProducer, options: LazyAnyValueOptions): IResolvable =
        software.amazon.awscdk.Lazy.any(producer.let(IStableAnyProducer::unwrap),
        options.let(LazyAnyValueOptions::unwrap)).let(IResolvable::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0679d26a0cf47861674eeb8f5a4e935244bf3d152d6dcd5bb7dfc5f939a51e0")
    public fun any(producer: IStableAnyProducer, options: LazyAnyValueOptions.Builder.() -> Unit):
        IResolvable = any(producer, LazyAnyValueOptions(options))

    public fun list(producer: IStableListProducer): List<String> =
        software.amazon.awscdk.Lazy.list(producer.let(IStableListProducer::unwrap))

    public fun list(producer: IStableListProducer, options: LazyListValueOptions): List<String> =
        software.amazon.awscdk.Lazy.list(producer.let(IStableListProducer::unwrap),
        options.let(LazyListValueOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efdafbef7fc79827388e3b2d1c20329010a3e92222edd611a096d219a4a5bb45")
    public fun list(producer: IStableListProducer,
        options: LazyListValueOptions.Builder.() -> Unit): List<String> = list(producer,
        LazyListValueOptions(options))

    public fun number(producer: IStableNumberProducer): Number =
        software.amazon.awscdk.Lazy.number(producer.let(IStableNumberProducer::unwrap))

    public fun string(producer: IStableStringProducer): String =
        software.amazon.awscdk.Lazy.string(producer.let(IStableStringProducer::unwrap))

    public fun string(producer: IStableStringProducer, options: LazyStringValueOptions): String =
        software.amazon.awscdk.Lazy.string(producer.let(IStableStringProducer::unwrap),
        options.let(LazyStringValueOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71870f5090c89664c5acffa24a31a3eb39f5338c28704709b72d122ad6b5bef6")
    public fun string(producer: IStableStringProducer,
        options: LazyStringValueOptions.Builder.() -> Unit): String = string(producer,
        LazyStringValueOptions(options))

    public fun uncachedAny(producer: IAnyProducer): IResolvable =
        software.amazon.awscdk.Lazy.uncachedAny(producer.let(IAnyProducer::unwrap)).let(IResolvable::wrap)

    public fun uncachedAny(producer: IAnyProducer, options: LazyAnyValueOptions): IResolvable =
        software.amazon.awscdk.Lazy.uncachedAny(producer.let(IAnyProducer::unwrap),
        options.let(LazyAnyValueOptions::unwrap)).let(IResolvable::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaaec60c092fd3616dd89f2eaa2a074ea3b25197c92ce4d752b3cbc5c0295e14")
    public fun uncachedAny(producer: IAnyProducer, options: LazyAnyValueOptions.Builder.() -> Unit):
        IResolvable = uncachedAny(producer, LazyAnyValueOptions(options))

    public fun uncachedList(producer: IListProducer): List<String> =
        software.amazon.awscdk.Lazy.uncachedList(producer.let(IListProducer::unwrap))

    public fun uncachedList(producer: IListProducer, options: LazyListValueOptions): List<String> =
        software.amazon.awscdk.Lazy.uncachedList(producer.let(IListProducer::unwrap),
        options.let(LazyListValueOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f22d51b4637668c95997c8ad0f3eb6aa9d1f34afd2dfbed3720a7206d09f4be")
    public fun uncachedList(producer: IListProducer,
        options: LazyListValueOptions.Builder.() -> Unit): List<String> = uncachedList(producer,
        LazyListValueOptions(options))

    public fun uncachedNumber(producer: INumberProducer): Number =
        software.amazon.awscdk.Lazy.uncachedNumber(producer.let(INumberProducer::unwrap))

    public fun uncachedString(producer: IStringProducer): String =
        software.amazon.awscdk.Lazy.uncachedString(producer.let(IStringProducer::unwrap))

    public fun uncachedString(producer: IStringProducer, options: LazyStringValueOptions): String =
        software.amazon.awscdk.Lazy.uncachedString(producer.let(IStringProducer::unwrap),
        options.let(LazyStringValueOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9ec31d44eea9a0c3c8a1d40d3f677f92a9aa7bf0f58a3d0ec20da69f6bc73e1")
    public fun uncachedString(producer: IStringProducer,
        options: LazyStringValueOptions.Builder.() -> Unit): String = uncachedString(producer,
        LazyStringValueOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.Lazy): Lazy = Lazy(cdkObject)

    internal fun unwrap(wrapped: Lazy): software.amazon.awscdk.Lazy = wrapped.cdkObject as
        software.amazon.awscdk.Lazy
  }
}
