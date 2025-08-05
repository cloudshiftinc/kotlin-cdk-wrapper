@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a link between a source account and a sink that you have created in a monitoring account.
 *
 * Before you create a link, you must create a sink in the monitoring account. The sink must have a
 * sink policy that permits the source account to link to it. You can grant permission to source
 * accounts by granting permission to an entire organization, an organizational unit, or to individual
 * accounts.
 *
 * For more information, see
 * [CreateSink](https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html) and
 * [PutSinkPolicy](https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html) .
 *
 * Each monitoring account can be linked to as many as 100,000 source accounts.
 *
 * Each source account can be linked to as many as five monitoring accounts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.oam.*;
 * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
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
public open class CfnLink(
  cdkObject: software.amazon.awscdk.services.oam.CfnLink,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLinkProps,
  ) :
      this(software.amazon.awscdk.services.oam.CfnLink(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLinkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLinkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLinkProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * Use this structure to optionally create filters that specify that only some metric namespaces
   * or log groups are to be shared from the source account to the monitoring account.
   */
  public open fun linkConfiguration(): Any? = unwrap(this).getLinkConfiguration()

  /**
   * Use this structure to optionally create filters that specify that only some metric namespaces
   * or log groups are to be shared from the source account to the monitoring account.
   */
  public open fun linkConfiguration(`value`: IResolvable) {
    unwrap(this).setLinkConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use this structure to optionally create filters that specify that only some metric namespaces
   * or log groups are to be shared from the source account to the monitoring account.
   */
  public open fun linkConfiguration(`value`: LinkConfigurationProperty) {
    unwrap(this).setLinkConfiguration(`value`.let(LinkConfigurationProperty.Companion::unwrap))
  }

  /**
   * Use this structure to optionally create filters that specify that only some metric namespaces
   * or log groups are to be shared from the source account to the monitoring account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1c4f2ae27fd10fbd00313cd2fd1db2afc5874c89c47875133098be129bdfc14")
  public open fun linkConfiguration(`value`: LinkConfigurationProperty.Builder.() -> Unit): Unit =
      linkConfiguration(LinkConfigurationProperty(`value`))

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
     *
     * In the  and  Regions, the only supported option is to use custom labels, and the
     * `$AccountName` , `$AccountEmail` , and `$AccountEmailNoDomain` variables all resolve as
     * *account-id* instead of the specified variable.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-labeltemplate)
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account. 
     */
    public fun labelTemplate(labelTemplate: String)

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    public fun linkConfiguration(linkConfiguration: IResolvable)

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    public fun linkConfiguration(linkConfiguration: LinkConfigurationProperty)

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f023ed46c2f574a2355e148ac03b8c6ca677f94961515df90dddb5daaafd79b")
    public fun linkConfiguration(linkConfiguration: LinkConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
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
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
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
     *
     * In the  and  Regions, the only supported option is to use custom labels, and the
     * `$AccountName` , `$AccountEmail` , and `$AccountEmailNoDomain` variables all resolve as
     * *account-id* instead of the specified variable.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-labeltemplate)
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     * account when you are viewing data from it in the monitoring account. 
     */
    override fun labelTemplate(labelTemplate: String) {
      cdkBuilder.labelTemplate(labelTemplate)
    }

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    override fun linkConfiguration(linkConfiguration: IResolvable) {
      cdkBuilder.linkConfiguration(linkConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    override fun linkConfiguration(linkConfiguration: LinkConfigurationProperty) {
      cdkBuilder.linkConfiguration(linkConfiguration.let(LinkConfigurationProperty.Companion::unwrap))
    }

    /**
     * Use this structure to optionally create filters that specify that only some metric namespaces
     * or log groups are to be shared from the source account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-linkconfiguration)
     * @param linkConfiguration Use this structure to optionally create filters that specify that
     * only some metric namespaces or log groups are to be shared from the source account to the
     * monitoring account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f023ed46c2f574a2355e148ac03b8c6ca677f94961515df90dddb5daaafd79b")
    override fun linkConfiguration(linkConfiguration: LinkConfigurationProperty.Builder.() -> Unit):
        Unit = linkConfiguration(LinkConfigurationProperty(linkConfiguration))

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace |
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
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
     * AWS::ApplicationInsights::Application | AWS::InternetMonitor::Monitor` .
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.oam.CfnLink.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as software.amazon.awscdk.services.oam.CfnLink
  }

  /**
   * Use this structure to optionally create filters that specify that only some metric namespaces
   * or log groups are to be shared from the source account to the monitoring account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.oam.*;
   * LinkConfigurationProperty linkConfigurationProperty = LinkConfigurationProperty.builder()
   * .logGroupConfiguration(LinkFilterProperty.builder()
   * .filter("filter")
   * .build())
   * .metricConfiguration(LinkFilterProperty.builder()
   * .filter("filter")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkconfiguration.html)
   */
  public interface LinkConfigurationProperty {
    /**
     * Use this structure to filter which log groups are to share log events from this source
     * account to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkconfiguration.html#cfn-oam-link-linkconfiguration-loggroupconfiguration)
     */
    public fun logGroupConfiguration(): Any? = unwrap(this).getLogGroupConfiguration()

    /**
     * Use this structure to filter which metric namespaces are to be shared from the source account
     * to the monitoring account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkconfiguration.html#cfn-oam-link-linkconfiguration-metricconfiguration)
     */
    public fun metricConfiguration(): Any? = unwrap(this).getMetricConfiguration()

    /**
     * A builder for [LinkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      public fun logGroupConfiguration(logGroupConfiguration: IResolvable)

      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      public fun logGroupConfiguration(logGroupConfiguration: LinkFilterProperty)

      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6071a625c6b3d9a327b833ab989a7caddb31359aa7034471a709a9a56f27c917")
      public fun logGroupConfiguration(logGroupConfiguration: LinkFilterProperty.Builder.() -> Unit)

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      public fun metricConfiguration(metricConfiguration: IResolvable)

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      public fun metricConfiguration(metricConfiguration: LinkFilterProperty)

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f1eac64888de848ebfafff66aa54b2a3f3a4e445e1ef1f0f075ad558f4f46b")
      public fun metricConfiguration(metricConfiguration: LinkFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty.Builder =
          software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty.builder()

      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      override fun logGroupConfiguration(logGroupConfiguration: IResolvable) {
        cdkBuilder.logGroupConfiguration(logGroupConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      override fun logGroupConfiguration(logGroupConfiguration: LinkFilterProperty) {
        cdkBuilder.logGroupConfiguration(logGroupConfiguration.let(LinkFilterProperty.Companion::unwrap))
      }

      /**
       * @param logGroupConfiguration Use this structure to filter which log groups are to share log
       * events from this source account to the monitoring account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6071a625c6b3d9a327b833ab989a7caddb31359aa7034471a709a9a56f27c917")
      override
          fun logGroupConfiguration(logGroupConfiguration: LinkFilterProperty.Builder.() -> Unit):
          Unit = logGroupConfiguration(LinkFilterProperty(logGroupConfiguration))

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      override fun metricConfiguration(metricConfiguration: IResolvable) {
        cdkBuilder.metricConfiguration(metricConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      override fun metricConfiguration(metricConfiguration: LinkFilterProperty) {
        cdkBuilder.metricConfiguration(metricConfiguration.let(LinkFilterProperty.Companion::unwrap))
      }

      /**
       * @param metricConfiguration Use this structure to filter which metric namespaces are to be
       * shared from the source account to the monitoring account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f1eac64888de848ebfafff66aa54b2a3f3a4e445e1ef1f0f075ad558f4f46b")
      override fun metricConfiguration(metricConfiguration: LinkFilterProperty.Builder.() -> Unit):
          Unit = metricConfiguration(LinkFilterProperty(metricConfiguration))

      public fun build(): software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty,
    ) : CdkObject(cdkObject),
        LinkConfigurationProperty {
      /**
       * Use this structure to filter which log groups are to share log events from this source
       * account to the monitoring account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkconfiguration.html#cfn-oam-link-linkconfiguration-loggroupconfiguration)
       */
      override fun logGroupConfiguration(): Any? = unwrap(this).getLogGroupConfiguration()

      /**
       * Use this structure to filter which metric namespaces are to be shared from the source
       * account to the monitoring account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkconfiguration.html#cfn-oam-link-linkconfiguration-metricconfiguration)
       */
      override fun metricConfiguration(): Any? = unwrap(this).getMetricConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LinkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty):
          LinkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LinkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinkConfigurationProperty):
          software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.oam.CfnLink.LinkConfigurationProperty
    }
  }

  /**
   * When used in `MetricConfiguration` this field specifies which metric namespaces are to be
   * shared with the monitoring account.
   *
   * When used in `LogGroupConfiguration` this field specifies which log groups are to share their
   * log events with the monitoring account. Use the term `LogGroupName` and one or more of the
   * following operands.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.oam.*;
   * LinkFilterProperty linkFilterProperty = LinkFilterProperty.builder()
   * .filter("filter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkfilter.html)
   */
  public interface LinkFilterProperty {
    /**
     * When used in `MetricConfiguration` this field specifies which metric namespaces are to be
     * shared with the monitoring account.
     *
     * When used in `LogGroupConfiguration` this field specifies which log groups are to share their
     * log events with the monitoring account. Use the term `LogGroupName` and one or more of the
     * following operands.
     *
     * Use single quotation marks (') around log group names and metric namespaces.
     *
     * The matching of log group names and metric namespaces is case sensitive. Each filter has a
     * limit of five conditional operands. Conditional operands are `AND` and `OR` .
     *
     * * `=` and `!=`
     * * `AND`
     * * `OR`
     * * `LIKE` and `NOT LIKE` . These can be used only as prefix searches. Include a `%` at the end
     * of the string that you want to search for and include.
     * * `IN` and `NOT IN` , using parentheses `( )`
     *
     * Examples:
     *
     * * `Namespace NOT LIKE 'AWS/%'` includes only namespaces that don't start with `AWS/` , such
     * as custom namespaces.
     * * `Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')` includes only the metrics in the EC2,
     * Elastic Load Balancing , and Amazon S3 namespaces.
     * * `Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'` includes only the EC2 namespace and
     * your custom namespaces.
     * * `LogGroupName IN ('This-Log-Group', 'Other-Log-Group')` includes only the log groups with
     * names `This-Log-Group` and `Other-Log-Group` .
     * * `LogGroupName NOT IN ('Private-Log-Group', 'Private-Log-Group-2')` includes all log groups
     * except the log groups with names `Private-Log-Group` and `Private-Log-Group-2` .
     * * `LogGroupName LIKE 'aws/lambda/%' OR LogGroupName LIKE 'AWSLogs%'` includes all log groups
     * that have names that start with `aws/lambda/` or `AWSLogs` .
     *
     *
     * If you are updating a link that uses filters, you can specify `*` as the only value for the
     * `filter` parameter to delete the filter and share all log groups with the monitoring account.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkfilter.html#cfn-oam-link-linkfilter-filter)
     */
    public fun filter(): String

    /**
     * A builder for [LinkFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filter When used in `MetricConfiguration` this field specifies which metric
       * namespaces are to be shared with the monitoring account. 
       * When used in `LogGroupConfiguration` this field specifies which log groups are to share
       * their log events with the monitoring account. Use the term `LogGroupName` and one or more of
       * the following operands.
       *
       * Use single quotation marks (') around log group names and metric namespaces.
       *
       * The matching of log group names and metric namespaces is case sensitive. Each filter has a
       * limit of five conditional operands. Conditional operands are `AND` and `OR` .
       *
       * * `=` and `!=`
       * * `AND`
       * * `OR`
       * * `LIKE` and `NOT LIKE` . These can be used only as prefix searches. Include a `%` at the
       * end of the string that you want to search for and include.
       * * `IN` and `NOT IN` , using parentheses `( )`
       *
       * Examples:
       *
       * * `Namespace NOT LIKE 'AWS/%'` includes only namespaces that don't start with `AWS/` , such
       * as custom namespaces.
       * * `Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')` includes only the metrics in the EC2,
       * Elastic Load Balancing , and Amazon S3 namespaces.
       * * `Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'` includes only the EC2 namespace and
       * your custom namespaces.
       * * `LogGroupName IN ('This-Log-Group', 'Other-Log-Group')` includes only the log groups with
       * names `This-Log-Group` and `Other-Log-Group` .
       * * `LogGroupName NOT IN ('Private-Log-Group', 'Private-Log-Group-2')` includes all log
       * groups except the log groups with names `Private-Log-Group` and `Private-Log-Group-2` .
       * * `LogGroupName LIKE 'aws/lambda/%' OR LogGroupName LIKE 'AWSLogs%'` includes all log
       * groups that have names that start with `aws/lambda/` or `AWSLogs` .
       *
       *
       * If you are updating a link that uses filters, you can specify `*` as the only value for the
       * `filter` parameter to delete the filter and share all log groups with the monitoring account.
       */
      public fun filter(filter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty.Builder
          = software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty.builder()

      /**
       * @param filter When used in `MetricConfiguration` this field specifies which metric
       * namespaces are to be shared with the monitoring account. 
       * When used in `LogGroupConfiguration` this field specifies which log groups are to share
       * their log events with the monitoring account. Use the term `LogGroupName` and one or more of
       * the following operands.
       *
       * Use single quotation marks (') around log group names and metric namespaces.
       *
       * The matching of log group names and metric namespaces is case sensitive. Each filter has a
       * limit of five conditional operands. Conditional operands are `AND` and `OR` .
       *
       * * `=` and `!=`
       * * `AND`
       * * `OR`
       * * `LIKE` and `NOT LIKE` . These can be used only as prefix searches. Include a `%` at the
       * end of the string that you want to search for and include.
       * * `IN` and `NOT IN` , using parentheses `( )`
       *
       * Examples:
       *
       * * `Namespace NOT LIKE 'AWS/%'` includes only namespaces that don't start with `AWS/` , such
       * as custom namespaces.
       * * `Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')` includes only the metrics in the EC2,
       * Elastic Load Balancing , and Amazon S3 namespaces.
       * * `Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'` includes only the EC2 namespace and
       * your custom namespaces.
       * * `LogGroupName IN ('This-Log-Group', 'Other-Log-Group')` includes only the log groups with
       * names `This-Log-Group` and `Other-Log-Group` .
       * * `LogGroupName NOT IN ('Private-Log-Group', 'Private-Log-Group-2')` includes all log
       * groups except the log groups with names `Private-Log-Group` and `Private-Log-Group-2` .
       * * `LogGroupName LIKE 'aws/lambda/%' OR LogGroupName LIKE 'AWSLogs%'` includes all log
       * groups that have names that start with `aws/lambda/` or `AWSLogs` .
       *
       *
       * If you are updating a link that uses filters, you can specify `*` as the only value for the
       * `filter` parameter to delete the filter and share all log groups with the monitoring account.
       */
      override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      public fun build(): software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty,
    ) : CdkObject(cdkObject),
        LinkFilterProperty {
      /**
       * When used in `MetricConfiguration` this field specifies which metric namespaces are to be
       * shared with the monitoring account.
       *
       * When used in `LogGroupConfiguration` this field specifies which log groups are to share
       * their log events with the monitoring account. Use the term `LogGroupName` and one or more of
       * the following operands.
       *
       * Use single quotation marks (') around log group names and metric namespaces.
       *
       * The matching of log group names and metric namespaces is case sensitive. Each filter has a
       * limit of five conditional operands. Conditional operands are `AND` and `OR` .
       *
       * * `=` and `!=`
       * * `AND`
       * * `OR`
       * * `LIKE` and `NOT LIKE` . These can be used only as prefix searches. Include a `%` at the
       * end of the string that you want to search for and include.
       * * `IN` and `NOT IN` , using parentheses `( )`
       *
       * Examples:
       *
       * * `Namespace NOT LIKE 'AWS/%'` includes only namespaces that don't start with `AWS/` , such
       * as custom namespaces.
       * * `Namespace IN ('AWS/EC2', 'AWS/ELB', 'AWS/S3')` includes only the metrics in the EC2,
       * Elastic Load Balancing , and Amazon S3 namespaces.
       * * `Namespace = 'AWS/EC2' OR Namespace NOT LIKE 'AWS/%'` includes only the EC2 namespace and
       * your custom namespaces.
       * * `LogGroupName IN ('This-Log-Group', 'Other-Log-Group')` includes only the log groups with
       * names `This-Log-Group` and `Other-Log-Group` .
       * * `LogGroupName NOT IN ('Private-Log-Group', 'Private-Log-Group-2')` includes all log
       * groups except the log groups with names `Private-Log-Group` and `Private-Log-Group-2` .
       * * `LogGroupName LIKE 'aws/lambda/%' OR LogGroupName LIKE 'AWSLogs%'` includes all log
       * groups that have names that start with `aws/lambda/` or `AWSLogs` .
       *
       *
       * If you are updating a link that uses filters, you can specify `*` as the only value for the
       * `filter` parameter to delete the filter and share all log groups with the monitoring account.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-oam-link-linkfilter.html#cfn-oam-link-linkfilter-filter)
       */
      override fun filter(): String = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LinkFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty):
          LinkFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? LinkFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinkFilterProperty):
          software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.oam.CfnLink.LinkFilterProperty
    }
  }
}
