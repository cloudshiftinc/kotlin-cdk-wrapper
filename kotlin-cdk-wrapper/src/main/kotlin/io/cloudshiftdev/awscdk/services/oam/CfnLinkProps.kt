@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.oam.*;
 * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
 * .resourceTypes(List.of("resourceTypes"))
 * .sinkIdentifier("sinkIdentifier")
 * // the properties below are optional
 * .labelTemplate("labelTemplate")
 * .linkConfiguration(LinkConfigurationProperty.builder()
 * .logGroupConfiguration(LinkFilterProperty.builder()
 * .filter("filter")
 * .build())
 * .metricConfiguration(LinkFilterProperty.builder()
 * .filter("filter")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html)
 */
public interface CfnLinkProps {
  /**
   * Specify a friendly human-readable name to use to identify this source account when you are
   * viewing data from it in the monitoring account.
   *
   * You can include the following variables in your template:
   *
   * * `$AccountName` is the name of the account
   * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such as
   * `mariagarcia&#64;example.com`
   * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-labeltemplate)
   */
  public fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
   */
  public fun linkConfiguration(): Any? = unwrap(this).getLinkConfiguration()

  /**
   * An array of strings that define which types of data that the source account shares with the
   * monitoring account.
   *
   * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
   * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
   */
  public fun resourceTypes(): List<String>

  /**
   * The ARN of the sink in the monitoring account that you want to link to.
   *
   * You can use [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html)
   * to find the ARNs of sinks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-sinkidentifier)
   */
  public fun sinkIdentifier(): String

  /**
   * An array of key-value pairs to apply to the link.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account.
     * You can include the following variables in your template:
     *
     * * `$AccountName` is the name of the account
     * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such
     * as `mariagarcia&#64;example.com`
     * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
     */
    public fun labelTemplate(labelTemplate: String)

    /**
     * @param linkConfiguration the value to be set.
     */
    public fun linkConfiguration(linkConfiguration: IResolvable)

    /**
     * @param linkConfiguration the value to be set.
     */
    public fun linkConfiguration(linkConfiguration: CfnLink.LinkConfigurationProperty)

    /**
     * @param linkConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c16b83fb005aa5f502bdd496d9c5765d2c4a68deb4bc415651ae331455a32cfc")
    public
        fun linkConfiguration(linkConfiguration: CfnLink.LinkConfigurationProperty.Builder.() -> Unit)

    /**
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
     */
    public fun resourceTypes(resourceTypes: List<String>)

    /**
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
     */
    public fun resourceTypes(vararg resourceTypes: String)

    /**
     * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to.
     * 
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find the
     * ARNs of sinks.
     */
    public fun sinkIdentifier(sinkIdentifier: String)

    /**
     * @param tags An array of key-value pairs to apply to the link.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnLinkProps.Builder =
        software.amazon.awscdk.services.oam.CfnLinkProps.builder()

    /**
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account.
     * You can include the following variables in your template:
     *
     * * `$AccountName` is the name of the account
     * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such
     * as `mariagarcia&#64;example.com`
     * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
     */
    override fun labelTemplate(labelTemplate: String) {
      cdkBuilder.labelTemplate(labelTemplate)
    }

    /**
     * @param linkConfiguration the value to be set.
     */
    override fun linkConfiguration(linkConfiguration: IResolvable) {
      cdkBuilder.linkConfiguration(linkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param linkConfiguration the value to be set.
     */
    override fun linkConfiguration(linkConfiguration: CfnLink.LinkConfigurationProperty) {
      cdkBuilder.linkConfiguration(linkConfiguration.let(CfnLink.LinkConfigurationProperty::unwrap))
    }

    /**
     * @param linkConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c16b83fb005aa5f502bdd496d9c5765d2c4a68deb4bc415651ae331455a32cfc")
    override
        fun linkConfiguration(linkConfiguration: CfnLink.LinkConfigurationProperty.Builder.() -> Unit):
        Unit = linkConfiguration(CfnLink.LinkConfigurationProperty(linkConfiguration))

    /**
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
     */
    override fun resourceTypes(resourceTypes: List<String>) {
      cdkBuilder.resourceTypes(resourceTypes)
    }

    /**
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
     */
    override fun resourceTypes(vararg resourceTypes: String): Unit =
        resourceTypes(resourceTypes.toList())

    /**
     * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to.
     * 
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find the
     * ARNs of sinks.
     */
    override fun sinkIdentifier(sinkIdentifier: String) {
      cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    /**
     * @param tags An array of key-value pairs to apply to the link.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnLinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.oam.CfnLinkProps,
  ) : CdkObject(cdkObject), CfnLinkProps {
    /**
     * Specify a friendly human-readable name to use to identify this source account when you are
     * viewing data from it in the monitoring account.
     *
     * You can include the following variables in your template:
     *
     * * `$AccountName` is the name of the account
     * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such
     * as `mariagarcia&#64;example.com`
     * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-labeltemplate)
     */
    override fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     */
    override fun linkConfiguration(): Any? = unwrap(this).getLinkConfiguration()

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     */
    override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()

    /**
     * The ARN of the sink in the monitoring account that you want to link to.
     *
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find the
     * ARNs of sinks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-sinkidentifier)
     */
    override fun sinkIdentifier(): String = unwrap(this).getSinkIdentifier()

    /**
     * An array of key-value pairs to apply to the link.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLinkProps): CfnLinkProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnLinkProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkProps): software.amazon.awscdk.services.oam.CfnLinkProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.oam.CfnLinkProps
  }
}
