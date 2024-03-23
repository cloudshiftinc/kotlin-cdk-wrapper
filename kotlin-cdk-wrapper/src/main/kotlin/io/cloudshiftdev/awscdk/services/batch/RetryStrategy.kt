@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Define how Jobs using this JobDefinition respond to different exit conditions.
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
public open class RetryStrategy(
  cdkObject: software.amazon.awscdk.services.batch.RetryStrategy,
) : CdkObject(cdkObject) {
  public constructor(action: Action, on: Reason) :
      this(software.amazon.awscdk.services.batch.RetryStrategy(action.let(Action::unwrap),
      on.let(Reason::unwrap))
  )

  /**
   * The action to take when the job exits with the Reason specified.
   */
  public open fun action(): Action = unwrap(this).getAction().let(Action::wrap)

  /**
   * If the job exits with this Reason it will trigger the specified Action.
   */
  public open fun on(): Reason = unwrap(this).getOn().let(Reason::wrap)

  public companion object {
    public fun of(action: Action, on: Reason): RetryStrategy =
        software.amazon.awscdk.services.batch.RetryStrategy.of(action.let(Action::unwrap),
        on.let(Reason::unwrap)).let(RetryStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.RetryStrategy): RetryStrategy
        = RetryStrategy(cdkObject)

    internal fun unwrap(wrapped: RetryStrategy): software.amazon.awscdk.services.batch.RetryStrategy
        = wrapped.cdkObject as software.amazon.awscdk.services.batch.RetryStrategy
  }
}
