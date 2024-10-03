@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnWorkerConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
 * CfnWorkerConfigurationProps cfnWorkerConfigurationProps = CfnWorkerConfigurationProps.builder()
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
public interface CfnWorkerConfigurationProps {
  /**
   * The description of a worker configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the worker configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-name)
   */
  public fun name(): String

  /**
   * Base64 encoded contents of the connect-distributed.properties file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-propertiesfilecontent)
   */
  public fun propertiesFileContent(): String

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnWorkerConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of a worker configuration.
     */
    public fun description(description: String)

    /**
     * @param name The name of the worker configuration. 
     */
    public fun name(name: String)

    /**
     * @param propertiesFileContent Base64 encoded contents of the connect-distributed.properties
     * file. 
     */
    public fun propertiesFileContent(propertiesFileContent: String)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps.builder()

    /**
     * @param description The description of a worker configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the worker configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param propertiesFileContent Base64 encoded contents of the connect-distributed.properties
     * file. 
     */
    override fun propertiesFileContent(propertiesFileContent: String) {
      cdkBuilder.propertiesFileContent(propertiesFileContent)
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnWorkerConfigurationProps {
    /**
     * The description of a worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the worker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Base64 encoded contents of the connect-distributed.properties file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-propertiesfilecontent)
     */
    override fun propertiesFileContent(): String = unwrap(this).getPropertiesFileContent()

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-workerconfiguration.html#cfn-kafkaconnect-workerconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkerConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps):
        CfnWorkerConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnWorkerConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkerConfigurationProps):
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kafkaconnect.CfnWorkerConfigurationProps
  }
}
