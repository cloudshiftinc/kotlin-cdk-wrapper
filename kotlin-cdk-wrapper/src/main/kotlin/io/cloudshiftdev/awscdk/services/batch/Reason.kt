@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Common job exit reasons.
 *
 * Example:
 *
 * ```
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .retryAttempts(5)
 * .retryStrategies(List.of(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER)))
 * .build();
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.SPOT_INSTANCE_RECLAIMED));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.custom(CustomReason.builder()
 * .onExitCode("40*")
 * .onReason("some reason")
 * .build())));
 * ```
 */
public open class Reason internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.Reason,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.batch.Reason()
  )

  public companion object {
    public val CANNOT_PULL_CONTAINER: Reason =
        Reason.wrap(software.amazon.awscdk.services.batch.Reason.CANNOT_PULL_CONTAINER)

    public val NON_ZERO_EXIT_CODE: Reason =
        Reason.wrap(software.amazon.awscdk.services.batch.Reason.NON_ZERO_EXIT_CODE)

    public val SPOT_INSTANCE_RECLAIMED: Reason =
        Reason.wrap(software.amazon.awscdk.services.batch.Reason.SPOT_INSTANCE_RECLAIMED)

    public fun custom(customReasonProps: CustomReason): Reason =
        software.amazon.awscdk.services.batch.Reason.custom(customReasonProps.let(CustomReason::unwrap)).let(Reason::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0480ecfc6e4061fd4538b746d5169cbfc3fa6a0d7d9393c764aba66b5778a9ba")
    public fun custom(customReasonProps: CustomReason.Builder.() -> Unit): Reason =
        custom(CustomReason(customReasonProps))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Reason): Reason =
        Reason(cdkObject)

    internal fun unwrap(wrapped: Reason): software.amazon.awscdk.services.batch.Reason =
        wrapped.cdkObject
  }
}
