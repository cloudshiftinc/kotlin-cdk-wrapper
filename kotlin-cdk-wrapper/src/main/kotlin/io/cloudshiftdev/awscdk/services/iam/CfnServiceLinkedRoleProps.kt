@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnServiceLinkedRoleProps {
  public fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

  public fun customSuffix(): String? = unwrap(this).getCustomSuffix()

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun awsServiceName(awsServiceName: String)

    public fun customSuffix(customSuffix: String)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps.Builder =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps.builder()

    override fun awsServiceName(awsServiceName: String) {
      cdkBuilder.awsServiceName(awsServiceName)
    }

    override fun customSuffix(customSuffix: String) {
      cdkBuilder.customSuffix(customSuffix)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps,
  ) : CdkObject(cdkObject), CfnServiceLinkedRoleProps {
    override fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

    override fun customSuffix(): String? = unwrap(this).getCustomSuffix()

    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceLinkedRoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps):
        CfnServiceLinkedRoleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLinkedRoleProps):
        software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
  }
}
