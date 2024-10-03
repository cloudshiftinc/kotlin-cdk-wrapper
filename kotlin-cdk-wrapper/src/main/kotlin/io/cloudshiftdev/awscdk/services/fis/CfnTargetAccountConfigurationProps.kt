@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTargetAccountConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fis.*;
 * CfnTargetAccountConfigurationProps cfnTargetAccountConfigurationProps =
 * CfnTargetAccountConfigurationProps.builder()
 * .accountId("accountId")
 * .experimentTemplateId("experimentTemplateId")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html)
 */
public interface CfnTargetAccountConfigurationProps {
  /**
   * The AWS account ID of the target account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-accountid)
   */
  public fun accountId(): String

  /**
   * The description of the target account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the experiment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-experimenttemplateid)
   */
  public fun experimentTemplateId(): String

  /**
   * The Amazon Resource Name (ARN) of an IAM role for the target account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnTargetAccountConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The AWS account ID of the target account. 
     */
    public fun accountId(accountId: String)

    /**
     * @param description The description of the target account.
     */
    public fun description(description: String)

    /**
     * @param experimentTemplateId The ID of the experiment template. 
     */
    public fun experimentTemplateId(experimentTemplateId: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps.Builder =
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps.builder()

    /**
     * @param accountId The AWS account ID of the target account. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param description The description of the target account.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param experimentTemplateId The ID of the experiment template. 
     */
    override fun experimentTemplateId(experimentTemplateId: String) {
      cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnTargetAccountConfigurationProps {
    /**
     * The AWS account ID of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-accountid)
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * The description of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-experimenttemplateid)
     */
    override fun experimentTemplateId(): String = unwrap(this).getExperimentTemplateId()

    /**
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetAccountConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps):
        CfnTargetAccountConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTargetAccountConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetAccountConfigurationProps):
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps
  }
}
