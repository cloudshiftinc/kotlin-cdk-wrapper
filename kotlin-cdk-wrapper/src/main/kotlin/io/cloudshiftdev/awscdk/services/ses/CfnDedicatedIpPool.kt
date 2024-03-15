@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDedicatedIpPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPool,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun poolName(): String? = unwrap(this).getPoolName()

  public open fun poolName(`value`: String) {
    unwrap(this).setPoolName(`value`)
  }

  public open fun scalingMode(): String? = unwrap(this).getScalingMode()

  public open fun scalingMode(`value`: String) {
    unwrap(this).setScalingMode(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun poolName(poolName: String)

    public fun scalingMode(scalingMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnDedicatedIpPool.Builder =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool.Builder.create(scope, id)

    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    override fun scalingMode(scalingMode: String) {
      cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnDedicatedIpPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDedicatedIpPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDedicatedIpPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPool):
        CfnDedicatedIpPool = CfnDedicatedIpPool(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPool):
        software.amazon.awscdk.services.ses.CfnDedicatedIpPool = wrapped.cdkObject
  }
}
