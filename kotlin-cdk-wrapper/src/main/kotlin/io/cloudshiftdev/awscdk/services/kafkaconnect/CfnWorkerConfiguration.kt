@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a worker configuration using the specified properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
 * CfnWorkerConfiguration cfnWorkerConfiguration = CfnWorkerConfiguration.Builder.create(this,
 * "MyCfnWorkerConfiguration")
 * .name("name")
 * .propertiesFileContent("propertiesFileContent")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html)
 */
public open class CfnWorkerConfiguration(
  cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkerConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnWorkerConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkerConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkerConfigurationProps(props)
  )

  /**
   * The revision of the worker configuration.
   */
  public open fun attrRevision(): Number = unwrap(this).getAttrRevision()

  /**
   * The Amazon Resource Name (ARN) of the worker configuration.
   */
  public open fun attrWorkerConfigurationArn(): String =
      unwrap(this).getAttrWorkerConfigurationArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of a worker configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of a worker configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the worker configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the worker configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Base64 encoded contents of the connect-distributed.properties file.
   */
  public open fun propertiesFileContent(): String = unwrap(this).getPropertiesFileContent()

  /**
   * Base64 encoded contents of the connect-distributed.properties file.
   */
  public open fun propertiesFileContent(`value`: String) {
    unwrap(this).setPropertiesFileContent(`value`)
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kafkaconnect.CfnWorkerConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of a worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-description)
     * @param description The description of a worker configuration. 
     */
    public fun description(description: String)

    /**
     * The name of the worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-name)
     * @param name The name of the worker configuration. 
     */
    public fun name(name: String)

    /**
     * Base64 encoded contents of the connect-distributed.properties file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-propertiesfilecontent)
     * @param propertiesFileContent Base64 encoded contents of the connect-distributed.properties
     * file. 
     */
    public fun propertiesFileContent(propertiesFileContent: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration.Builder.create(scope,
        id)

    /**
     * The description of a worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-description)
     * @param description The description of a worker configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-name)
     * @param name The name of the worker configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Base64 encoded contents of the connect-distributed.properties file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-propertiesfilecontent)
     * @param propertiesFileContent Base64 encoded contents of the connect-distributed.properties
     * file. 
     */
    override fun propertiesFileContent(propertiesFileContent: String) {
      cdkBuilder.propertiesFileContent(propertiesFileContent)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkerConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkerConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration):
        CfnWorkerConfiguration = CfnWorkerConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnWorkerConfiguration):
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfiguration
  }
}
