package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLink internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.oam.CfnLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the link.
   *
   * For example, `arn:aws:oam:us-west-1:111111111111:link:abcd1234-a123-456a-a12b-a123b456c789`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The friendly human-readable name used to identify this source account when it is viewed from
   * the monitoring account.
   *
   * For example, `my-account1` .
   */
  public open fun attrLabel(): String = unwrap(this).getAttrLabel()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specify a friendly human-readable name to use to identify this source account when you are
   * viewing data from it in the monitoring account.
   */
  public open fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

  /**
   * Specify a friendly human-readable name to use to identify this source account when you are
   * viewing data from it in the monitoring account.
   */
  public open fun labelTemplate(`value`: String) {
    unwrap(this).setLabelTemplate(`value`)
  }

  /**
   * An array of strings that define which types of data that the source account shares with the
   * monitoring account.
   */
  public open fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()

  /**
   * An array of strings that define which types of data that the source account shares with the
   * monitoring account.
   */
  public open fun resourceTypes(`value`: List<String>) {
    unwrap(this).setResourceTypes(`value`)
  }

  /**
   * An array of strings that define which types of data that the source account shares with the
   * monitoring account.
   */
  public open fun resourceTypes(vararg `value`: String): Unit = resourceTypes(`value`.toList())

  /**
   * The ARN of the sink in the monitoring account that you want to link to.
   */
  public open fun sinkIdentifier(): String = unwrap(this).getSinkIdentifier()

  /**
   * The ARN of the sink in the monitoring account that you want to link to.
   */
  public open fun sinkIdentifier(`value`: String) {
    unwrap(this).setSinkIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to the link.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to the link.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.oam.CfnLink].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account. 
     */
    public fun labelTemplate(labelTemplate: String)

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     */
    public fun resourceTypes(resourceTypes: List<String>)

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     */
    public fun resourceTypes(vararg resourceTypes: String)

    /**
     * The ARN of the sink in the monitoring account that you want to link to.
     *
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find the
     * ARNs of sinks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-sinkidentifier)
     * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to.
     * 
     */
    public fun sinkIdentifier(sinkIdentifier: String)

    /**
     * An array of key-value pairs to apply to the link.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-tags)
     * @param tags An array of key-value pairs to apply to the link. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnLink.Builder =
        software.amazon.awscdk.services.oam.CfnLink.Builder.create(scope, id)

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
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account. 
     */
    override fun labelTemplate(labelTemplate: String) {
      cdkBuilder.labelTemplate(labelTemplate)
    }

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     */
    override fun resourceTypes(resourceTypes: List<String>) {
      cdkBuilder.resourceTypes(resourceTypes)
    }

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     * @param resourceTypes An array of strings that define which types of data that the source
     * account shares with the monitoring account. 
     */
    override fun resourceTypes(vararg resourceTypes: String): Unit =
        resourceTypes(resourceTypes.toList())

    /**
     * The ARN of the sink in the monitoring account that you want to link to.
     *
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find the
     * ARNs of sinks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-sinkidentifier)
     * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to.
     * 
     */
    override fun sinkIdentifier(sinkIdentifier: String) {
      cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    /**
     * An array of key-value pairs to apply to the link.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-tags)
     * @param tags An array of key-value pairs to apply to the link. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnLink = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLink): CfnLink =
        CfnLink(cdkObject)

    internal fun unwrap(wrapped: CfnLink): software.amazon.awscdk.services.oam.CfnLink =
        wrapped.cdkObject
  }
}
