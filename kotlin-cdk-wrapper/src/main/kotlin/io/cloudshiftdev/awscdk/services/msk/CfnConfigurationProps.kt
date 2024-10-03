@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

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
 * Properties for defining a `CfnConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
 * .name("name")
 * .serverProperties("serverProperties")
 * // the properties below are optional
 * .description("description")
 * .kafkaVersionsList(List.of("kafkaVersionsList"))
 * .latestRevision(LatestRevisionProperty.builder()
 * .creationTime("creationTime")
 * .description("description")
 * .revision(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html)
 */
public interface CfnConfigurationProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
   */
  public fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
   */
  public fun latestRevision(): Any? = unwrap(this).getLatestRevision()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
   */
  public fun serverProperties(): String

  /**
   * A builder for [CfnConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param kafkaVersionsList the value to be set.
     */
    public fun kafkaVersionsList(kafkaVersionsList: List<String>)

    /**
     * @param kafkaVersionsList the value to be set.
     */
    public fun kafkaVersionsList(vararg kafkaVersionsList: String)

    /**
     * @param latestRevision the value to be set.
     */
    public fun latestRevision(latestRevision: IResolvable)

    /**
     * @param latestRevision the value to be set.
     */
    public fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty)

    /**
     * @param latestRevision the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0d5b7745687c027d7615e97a5a5910469bb1a8c24279cee0902098c91e4f089")
    public
        fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty.Builder.() -> Unit)

    /**
     * @param name the value to be set. 
     */
    public fun name(name: String)

    /**
     * @param serverProperties the value to be set. 
     */
    public fun serverProperties(serverProperties: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnConfigurationProps.Builder =
        software.amazon.awscdk.services.msk.CfnConfigurationProps.builder()

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kafkaVersionsList the value to be set.
     */
    override fun kafkaVersionsList(kafkaVersionsList: List<String>) {
      cdkBuilder.kafkaVersionsList(kafkaVersionsList)
    }

    /**
     * @param kafkaVersionsList the value to be set.
     */
    override fun kafkaVersionsList(vararg kafkaVersionsList: String): Unit =
        kafkaVersionsList(kafkaVersionsList.toList())

    /**
     * @param latestRevision the value to be set.
     */
    override fun latestRevision(latestRevision: IResolvable) {
      cdkBuilder.latestRevision(latestRevision.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param latestRevision the value to be set.
     */
    override fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty) {
      cdkBuilder.latestRevision(latestRevision.let(CfnConfiguration.LatestRevisionProperty.Companion::unwrap))
    }

    /**
     * @param latestRevision the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0d5b7745687c027d7615e97a5a5910469bb1a8c24279cee0902098c91e4f089")
    override
        fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty.Builder.() -> Unit):
        Unit = latestRevision(CfnConfiguration.LatestRevisionProperty(latestRevision))

    /**
     * @param name the value to be set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serverProperties the value to be set. 
     */
    override fun serverProperties(serverProperties: String) {
      cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnConfigurationProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     */
    override fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     */
    override fun latestRevision(): Any? = unwrap(this).getLatestRevision()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     */
    override fun serverProperties(): String = unwrap(this).getServerProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfigurationProps):
        CfnConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigurationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProps):
        software.amazon.awscdk.services.msk.CfnConfigurationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnConfigurationProps
  }
}
