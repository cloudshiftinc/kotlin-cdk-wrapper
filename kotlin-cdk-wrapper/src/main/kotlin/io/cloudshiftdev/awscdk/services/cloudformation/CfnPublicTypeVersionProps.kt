@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPublicTypeVersionProps {
  public fun arn(): String? = unwrap(this).getArn()

  public fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

  public fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

  public fun type(): String? = unwrap(this).getType()

  public fun typeName(): String? = unwrap(this).getTypeName()

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun logDeliveryBucket(logDeliveryBucket: String)

    public fun publicVersionNumber(publicVersionNumber: String)

    public fun type(type: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun logDeliveryBucket(logDeliveryBucket: String) {
      cdkBuilder.logDeliveryBucket(logDeliveryBucket)
    }

    override fun publicVersionNumber(publicVersionNumber: String) {
      cdkBuilder.publicVersionNumber(publicVersionNumber)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps,
  ) : CdkObject(cdkObject), CfnPublicTypeVersionProps {
    override fun arn(): String? = unwrap(this).getArn()

    override fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

    override fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

    override fun type(): String? = unwrap(this).getType()

    override fun typeName(): String? = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicTypeVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps):
        CfnPublicTypeVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicTypeVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
  }
}
