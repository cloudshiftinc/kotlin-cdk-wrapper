@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationProviderArn("applicationProviderArn")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .portalOptions(PortalOptionsConfigurationProperty.builder()
 * .signInOptions(SignInOptionsProperty.builder()
 * .origin("origin")
 * // the properties below are optional
 * .applicationUrl("applicationUrl")
 * .build())
 * .visibility("visibility")
 * .build())
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html)
 */
public interface CfnApplicationProps {
  /**
   * The ARN of the application provider for this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-applicationproviderarn)
   */
  public fun applicationProviderArn(): String

  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ARN of the instance of IAM Identity Center that is configured with this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-name)
   */
  public fun name(): String

  /**
   * A structure that describes the options for the access portal associated with this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
   */
  public fun portalOptions(): Any? = unwrap(this).getPortalOptions()

  /**
   * The current status of the application in this instance of IAM Identity Center.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Specifies tags to be attached to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationProviderArn The ARN of the application provider for this application. 
     */
    public fun applicationProviderArn(applicationProviderArn: String)

    /**
     * @param description The description of the application.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The ARN of the instance of IAM Identity Center that is configured with
     * this application. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    public fun portalOptions(portalOptions: IResolvable)

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    public fun portalOptions(portalOptions: CfnApplication.PortalOptionsConfigurationProperty)

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b26c17cdf08e4530da2999ff481142fea5afcd2c878fe9c9d430a2f9fd019537")
    public
        fun portalOptions(portalOptions: CfnApplication.PortalOptionsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param status The current status of the application in this instance of IAM Identity Center.
     */
    public fun status(status: String)

    /**
     * @param tags Specifies tags to be attached to the application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies tags to be attached to the application.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.sso.CfnApplicationProps.builder()

    /**
     * @param applicationProviderArn The ARN of the application provider for this application. 
     */
    override fun applicationProviderArn(applicationProviderArn: String) {
      cdkBuilder.applicationProviderArn(applicationProviderArn)
    }

    /**
     * @param description The description of the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The ARN of the instance of IAM Identity Center that is configured with
     * this application. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    override fun portalOptions(portalOptions: IResolvable) {
      cdkBuilder.portalOptions(portalOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    override fun portalOptions(portalOptions: CfnApplication.PortalOptionsConfigurationProperty) {
      cdkBuilder.portalOptions(portalOptions.let(CfnApplication.PortalOptionsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param portalOptions A structure that describes the options for the access portal associated
     * with this application.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b26c17cdf08e4530da2999ff481142fea5afcd2c878fe9c9d430a2f9fd019537")
    override
        fun portalOptions(portalOptions: CfnApplication.PortalOptionsConfigurationProperty.Builder.() -> Unit):
        Unit = portalOptions(CfnApplication.PortalOptionsConfigurationProperty(portalOptions))

    /**
     * @param status The current status of the application in this instance of IAM Identity Center.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Specifies tags to be attached to the application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies tags to be attached to the application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnApplicationProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sso.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * The ARN of the application provider for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-applicationproviderarn)
     */
    override fun applicationProviderArn(): String = unwrap(this).getApplicationProviderArn()

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A structure that describes the options for the access portal associated with this
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-portaloptions)
     */
    override fun portalOptions(): Any? = unwrap(this).getPortalOptions()

    /**
     * The current status of the application in this instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Specifies tags to be attached to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-application.html#cfn-sso-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.sso.CfnApplicationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sso.CfnApplicationProps
  }
}
