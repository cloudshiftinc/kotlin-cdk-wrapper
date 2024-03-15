@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a target account configuration for the experiment template.
 *
 * A target account configuration is required when `accountTargeting` of `experimentOptions` is set
 * to `multi-account` . For more information, see [experiment
 * options](https://docs.aws.amazon.com/fis/latest/userguide/experiment-options.html) in the *AWS Fault
 * Injection Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fis.*;
 * CfnTargetAccountConfiguration cfnTargetAccountConfiguration =
 * CfnTargetAccountConfiguration.Builder.create(this, "MyCfnTargetAccountConfiguration")
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
public open class CfnTargetAccountConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The AWS account ID of the target account.
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   * The AWS account ID of the target account.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * The description of the target account.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the target account.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the experiment template.
   */
  public open fun experimentTemplateId(): String = unwrap(this).getExperimentTemplateId()

  /**
   * The ID of the experiment template.
   */
  public open fun experimentTemplateId(`value`: String) {
    unwrap(this).setExperimentTemplateId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role for the target account.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role for the target account.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fis.CfnTargetAccountConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-accountid)
     * @param accountId The AWS account ID of the target account. 
     */
    public fun accountId(accountId: String)

    /**
     * The description of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-description)
     * @param description The description of the target account. 
     */
    public fun description(description: String)

    /**
     * The ID of the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-experimenttemplateid)
     * @param experimentTemplateId The ID of the experiment template. 
     */
    public fun experimentTemplateId(experimentTemplateId: String)

    /**
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration.Builder =
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration.Builder.create(scope, id)

    /**
     * The AWS account ID of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-accountid)
     * @param accountId The AWS account ID of the target account. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The description of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-description)
     * @param description The description of the target account. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-experimenttemplateid)
     * @param experimentTemplateId The ID of the experiment template. 
     */
    override fun experimentTemplateId(experimentTemplateId: String) {
      cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetAccountConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetAccountConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration):
        CfnTargetAccountConfiguration = CfnTargetAccountConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnTargetAccountConfiguration):
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration = wrapped.cdkObject
  }
}
