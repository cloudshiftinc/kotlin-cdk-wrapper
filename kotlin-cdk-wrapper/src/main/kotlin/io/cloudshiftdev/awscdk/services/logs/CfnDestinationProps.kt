@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDestinationProps {
  public fun destinationName(): String

  public fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

  public fun roleArn(): String

  public fun targetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun destinationName(destinationName: String)

    public fun destinationPolicy(destinationPolicy: String)

    public fun roleArn(roleArn: String)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDestinationProps.Builder =
        software.amazon.awscdk.services.logs.CfnDestinationProps.builder()

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun destinationPolicy(destinationPolicy: String) {
      cdkBuilder.destinationPolicy(destinationPolicy)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnDestinationProps,
  ) : CdkObject(cdkObject), CfnDestinationProps {
    override fun destinationName(): String = unwrap(this).getDestinationName()

    override fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDestinationProps):
        CfnDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDestinationProps):
        software.amazon.awscdk.services.logs.CfnDestinationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnDestinationProps
  }
}
