@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Registers your account as a publisher of public extensions in the CloudFormation registry.
 *
 * Public extensions are available for use by all CloudFormation users.
 *
 * For information on requirements for registering as a public extension publisher, see [Registering
 * your account to publish CloudFormation
 * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
 * in the *CloudFormation CLI User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnPublisher cfnPublisher = CfnPublisher.Builder.create(this, "MyCfnPublisher")
 * .acceptTermsAndConditions(false)
 * // the properties below are optional
 * .connectionArn("connectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
 */
public open class CfnPublisher(
  cdkObject: software.amazon.awscdk.CfnPublisher,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPublisherProps,
  ) :
      this(software.amazon.awscdk.CfnPublisher(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPublisherProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPublisherProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPublisherProps(props)
  )

  /**
   * Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry.
   */
  public open fun acceptTermsAndConditions(): Any = unwrap(this).getAcceptTermsAndConditions()

  /**
   * Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry.
   */
  public open fun acceptTermsAndConditions(`value`: Boolean) {
    unwrap(this).setAcceptTermsAndConditions(`value`)
  }

  /**
   * Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry.
   */
  public open fun acceptTermsAndConditions(`value`: IResolvable) {
    unwrap(this).setAcceptTermsAndConditions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The type of account used as the identity provider when registering this publisher with
   * CloudFormation.
   */
  public open fun attrIdentityProvider(): String = unwrap(this).getAttrIdentityProvider()

  /**
   * The ID of the extension publisher.
   */
  public open fun attrPublisherId(): String = unwrap(this).getAttrPublisherId()

  /**
   * The URL to the publisher's profile with the identity provider.
   */
  public open fun attrPublisherProfile(): String = unwrap(this).getAttrPublisherProfile()

  /**
   * Whether the publisher is verified.
   *
   * Currently, all registered publishers are verified.
   */
  public open fun attrPublisherStatus(): String = unwrap(this).getAttrPublisherStatus()

  /**
   * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
   * Name (ARN) for your connection to that account.
   */
  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
   * Name (ARN) for your connection to that account.
   */
  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnPublisher].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean)

    /**
     * Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable)

    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
     * Name (ARN) for your connection to that account.
     *
     * For more information, see [Registering your account to publish CloudFormation
     * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-connectionarn)
     * @param connectionArn If you are using a Bitbucket or GitHub account for identity
     * verification, the Amazon Resource Name (ARN) for your connection to that account. 
     */
    public fun connectionArn(connectionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnPublisher.Builder =
        software.amazon.awscdk.CfnPublisher.Builder.create(scope, id)

    /**
     * Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     */
    override fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    /**
     * Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     * @param acceptTermsAndConditions Whether you accept the [Terms and
     * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry. 
     */
    override fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
     * Name (ARN) for your connection to that account.
     *
     * For more information, see [Registering your account to publish CloudFormation
     * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-connectionarn)
     * @param connectionArn If you are using a Bitbucket or GitHub account for identity
     * verification, the Amazon Resource Name (ARN) for your connection to that account. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): software.amazon.awscdk.CfnPublisher = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnPublisher.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublisher {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublisher(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnPublisher): CfnPublisher =
        CfnPublisher(cdkObject)

    internal fun unwrap(wrapped: CfnPublisher): software.amazon.awscdk.CfnPublisher =
        wrapped.cdkObject as software.amazon.awscdk.CfnPublisher
  }
}
