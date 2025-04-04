@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
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
public open class CfnConfiguration(
  cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationProps(props)
  )

  /**
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrLatestRevisionCreationTime(): String =
      unwrap(this).getAttrLatestRevisionCreationTime()

  /**
   *
   */
  public open fun attrLatestRevisionDescription(): String =
      unwrap(this).getAttrLatestRevisionDescription()

  /**
   *
   */
  public open fun attrLatestRevisionRevision(): Number =
      unwrap(this).getAttrLatestRevisionRevision()

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?:
      emptyList()

  /**
   *
   */
  public open fun kafkaVersionsList(`value`: List<String>) {
    unwrap(this).setKafkaVersionsList(`value`)
  }

  /**
   *
   */
  public open fun kafkaVersionsList(vararg `value`: String): Unit =
      kafkaVersionsList(`value`.toList())

  /**
   *
   */
  public open fun latestRevision(): Any? = unwrap(this).getLatestRevision()

  /**
   *
   */
  public open fun latestRevision(`value`: IResolvable) {
    unwrap(this).setLatestRevision(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun latestRevision(`value`: LatestRevisionProperty) {
    unwrap(this).setLatestRevision(`value`.let(LatestRevisionProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff7fd235140ed3b9b780d2100e75ea7200fbe4458150e1be2c200f3f55992d89")
  public open fun latestRevision(`value`: LatestRevisionProperty.Builder.() -> Unit): Unit =
      latestRevision(LatestRevisionProperty(`value`))

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun serverProperties(): String = unwrap(this).getServerProperties()

  /**
   *
   */
  public open fun serverProperties(`value`: String) {
    unwrap(this).setServerProperties(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList 
     */
    public fun kafkaVersionsList(kafkaVersionsList: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList 
     */
    public fun kafkaVersionsList(vararg kafkaVersionsList: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    public fun latestRevision(latestRevision: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    public fun latestRevision(latestRevision: LatestRevisionProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    public fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     * @param serverProperties 
     */
    public fun serverProperties(serverProperties: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnConfiguration.Builder =
        software.amazon.awscdk.services.msk.CfnConfiguration.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList 
     */
    override fun kafkaVersionsList(kafkaVersionsList: List<String>) {
      cdkBuilder.kafkaVersionsList(kafkaVersionsList)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList 
     */
    override fun kafkaVersionsList(vararg kafkaVersionsList: String): Unit =
        kafkaVersionsList(kafkaVersionsList.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    override fun latestRevision(latestRevision: IResolvable) {
      cdkBuilder.latestRevision(latestRevision.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    override fun latestRevision(latestRevision: LatestRevisionProperty) {
      cdkBuilder.latestRevision(latestRevision.let(LatestRevisionProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    override fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit): Unit =
        latestRevision(LatestRevisionProperty(latestRevision))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     * @param serverProperties 
     */
    override fun serverProperties(serverProperties: String) {
      cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnConfiguration = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration):
        CfnConfiguration = CfnConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguration):
        software.amazon.awscdk.services.msk.CfnConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.msk.CfnConfiguration
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * LatestRevisionProperty latestRevisionProperty = LatestRevisionProperty.builder()
   * .creationTime("creationTime")
   * .description("description")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html)
   */
  public interface LatestRevisionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-creationtime)
     */
    public fun creationTime(): String? = unwrap(this).getCreationTime()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-revision)
     */
    public fun revision(): Number? = unwrap(this).getRevision()

    /**
     * A builder for [LatestRevisionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param creationTime the value to be set.
       */
      public fun creationTime(creationTime: String)

      /**
       * @param description the value to be set.
       */
      public fun description(description: String)

      /**
       * @param revision the value to be set.
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.Builder =
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.builder()

      /**
       * @param creationTime the value to be set.
       */
      override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      /**
       * @param description the value to be set.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param revision the value to be set.
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty,
    ) : CdkObject(cdkObject),
        LatestRevisionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-creationtime)
       */
      override fun creationTime(): String? = unwrap(this).getCreationTime()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-revision)
       */
      override fun revision(): Number? = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LatestRevisionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty):
          LatestRevisionProperty = CdkObjectWrappers.wrap(cdkObject) as? LatestRevisionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LatestRevisionProperty):
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty
    }
  }
}
