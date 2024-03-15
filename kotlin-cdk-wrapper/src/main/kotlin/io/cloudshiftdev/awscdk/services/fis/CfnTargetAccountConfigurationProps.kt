@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTargetAccountConfigurationProps {
  public fun accountId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun experimentTemplateId(): String

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun description(description: String)

    public fun experimentTemplateId(experimentTemplateId: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps.Builder =
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun experimentTemplateId(experimentTemplateId: String) {
      cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps,
  ) : CdkObject(cdkObject), CfnTargetAccountConfigurationProps {
    override fun accountId(): String = unwrap(this).getAccountId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun experimentTemplateId(): String = unwrap(this).getExperimentTemplateId()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetAccountConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps):
        CfnTargetAccountConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetAccountConfigurationProps):
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps
  }
}
