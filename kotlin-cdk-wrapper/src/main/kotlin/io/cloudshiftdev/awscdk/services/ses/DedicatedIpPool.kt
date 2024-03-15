@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A dedicated IP pool.
 *
 * Example:
 *
 * ```
 * DedicatedIpPool.Builder.create(this, "Pool")
 * .dedicatedIpPoolName("mypool")
 * .scalingMode(ScalingMode.STANDARD)
 * .build();
 * ```
 */
public open class DedicatedIpPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPool,
) : Resource(cdkObject), IDedicatedIpPool {
  /**
   * The name of the dedicated IP pool.
   */
  public override fun dedicatedIpPoolName(): String = unwrap(this).getDedicatedIpPoolName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.DedicatedIpPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the dedicated IP pool.
     *
     * The name must adhere to specific constraints: it can only include
     * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
     * and must not exceed 64 characters in length.
     *
     * Default: - a CloudFormation generated name
     *
     * @param dedicatedIpPoolName A name for the dedicated IP pool. 
     */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String)

    /**
     * The type of scailing mode to use for this IP pool.
     *
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`.
     * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     *
     * Default: ScalingMode.STANDARD
     *
     * @param scalingMode The type of scailing mode to use for this IP pool. 
     */
    public fun scalingMode(scalingMode: ScalingMode)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DedicatedIpPool.Builder =
        software.amazon.awscdk.services.ses.DedicatedIpPool.Builder.create(scope, id)

    /**
     * A name for the dedicated IP pool.
     *
     * The name must adhere to specific constraints: it can only include
     * lowercase letters (a-z), numbers (0-9), underscores (_), and hyphens (-),
     * and must not exceed 64 characters in length.
     *
     * Default: - a CloudFormation generated name
     *
     * @param dedicatedIpPoolName A name for the dedicated IP pool. 
     */
    override fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
      cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    /**
     * The type of scailing mode to use for this IP pool.
     *
     * Updating ScalingMode doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED`.
     * However, updating ScalingMode from `MANAGED` to `STANDARD` is not supported.
     *
     * Default: ScalingMode.STANDARD
     *
     * @param scalingMode The type of scailing mode to use for this IP pool. 
     */
    override fun scalingMode(scalingMode: ScalingMode) {
      cdkBuilder.scalingMode(scalingMode.let(ScalingMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DedicatedIpPool = cdkBuilder.build()
  }

  public companion object {
    public fun fromDedicatedIpPoolName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      dedicatedIpPoolName: String,
    ): IDedicatedIpPool =
        software.amazon.awscdk.services.ses.DedicatedIpPool.fromDedicatedIpPoolName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, dedicatedIpPoolName).let(IDedicatedIpPool::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DedicatedIpPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DedicatedIpPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPool):
        DedicatedIpPool = DedicatedIpPool(cdkObject)

    internal fun unwrap(wrapped: DedicatedIpPool):
        software.amazon.awscdk.services.ses.DedicatedIpPool = wrapped.cdkObject
  }
}
