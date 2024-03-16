@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPublisher`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnPublisherProps cfnPublisherProps = CfnPublisherProps.builder()
 * .acceptTermsAndConditions(false)
 * // the properties below are optional
 * .connectionArn("connectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
 */
public interface CfnPublisherProps {
  /**
   * Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry.
   *
   * The default is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
   */
  public fun acceptTermsAndConditions(): Any

  /**
   * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
   * Name (ARN) for your connection to that account.
   *
   * For more information, see [Registering your account to publish CloudFormation
   * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
   * in the *CloudFormation CLI User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-connectionarn)
   */
  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   * A builder for [CfnPublisherProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     * The default is `false` .
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean)

    /**
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     * The default is `false` .
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable)

    /**
     * @param connectionArn If you are using a Bitbucket or GitHub account for identity
     * verification, the Amazon Resource Name (ARN) for your connection to that account.
     * For more information, see [Registering your account to publish CloudFormation
     * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *CloudFormation CLI User Guide* .
     */
    public fun connectionArn(connectionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnPublisherProps.Builder
        = software.amazon.awscdk.services.cloudformation.CfnPublisherProps.builder()

    /**
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     * The default is `false` .
     */
    override fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    /**
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     * The default is `false` .
     */
    override fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions.let(IResolvable::unwrap))
    }

    /**
     * @param connectionArn If you are using a Bitbucket or GitHub account for identity
     * verification, the Amazon Resource Name (ARN) for your connection to that account.
     * For more information, see [Registering your account to publish CloudFormation
     * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *CloudFormation CLI User Guide* .
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnPublisherProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnPublisherProps,
  ) : CdkObject(cdkObject), CfnPublisherProps {
    /**
     * Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     */
    override fun acceptTermsAndConditions(): Any = unwrap(this).getAcceptTermsAndConditions()

    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
     * Name (ARN) for your connection to that account.
     *
     * For more information, see [Registering your account to publish CloudFormation
     * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *CloudFormation CLI User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-connectionarn)
     */
    override fun connectionArn(): String? = unwrap(this).getConnectionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublisherProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnPublisherProps):
        CfnPublisherProps = CdkObjectWrappers.wrap(cdkObject) as CfnPublisherProps

    internal fun unwrap(wrapped: CfnPublisherProps):
        software.amazon.awscdk.services.cloudformation.CfnPublisherProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnPublisherProps
  }
}
