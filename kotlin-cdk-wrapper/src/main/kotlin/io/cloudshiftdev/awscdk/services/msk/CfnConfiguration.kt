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
 * Creates a new MSK configuration.
 *
 * To see an example of how to use this operation, first save the following text to a file and name
 * the file `config-file.txt` .
 *
 * `auto.create.topics.enable = true zookeeper.connection.timeout.ms = 1000 log.roll.ms = 604800000`
 *
 * Now run the following Python 3.6 script in the folder where you saved `config-file.txt` . This
 * script uses the properties specified in `config-file.txt` to create a configuration named
 * `SalesClusterConfiguration` . This configuration can work with Apache Kafka versions 1.1.1 and
 * 2.1.0.
 *
 * ```
 * import boto3 client = boto3.client('kafka') config_file = open('config-file.txt', 'r')
 * server_properties = config_file.read() response = client.create_configuration(
 * Name='SalesClusterConfiguration', Description='The configuration to use on all sales clusters.',
 * KafkaVersions=['1.1.1', '2.1.0'], ServerProperties=server_properties
 * ) print(response)
 * ```
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
   * The Amazon Resource Name (ARN) of the configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time when the configuration revision was created.
   */
  public open fun attrLatestRevisionCreationTime(): String =
      unwrap(this).getAttrLatestRevisionCreationTime()

  /**
   * The description of the configuration revision.
   */
  public open fun attrLatestRevisionDescription(): String =
      unwrap(this).getAttrLatestRevisionDescription()

  /**
   * The revision number.
   */
  public open fun attrLatestRevisionRevision(): Number =
      unwrap(this).getAttrLatestRevisionRevision()

  /**
   * The description of the configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the configuration.
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
   * The [versions of Apache
   * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
   * which you can use this MSK configuration.
   */
  public open fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?:
      emptyList()

  /**
   * The [versions of Apache
   * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
   * which you can use this MSK configuration.
   */
  public open fun kafkaVersionsList(`value`: List<String>) {
    unwrap(this).setKafkaVersionsList(`value`)
  }

  /**
   * The [versions of Apache
   * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
   * which you can use this MSK configuration.
   */
  public open fun kafkaVersionsList(vararg `value`: String): Unit =
      kafkaVersionsList(`value`.toList())

  /**
   * Latest revision of the MSK configuration.
   */
  public open fun latestRevision(): Any? = unwrap(this).getLatestRevision()

  /**
   * Latest revision of the MSK configuration.
   */
  public open fun latestRevision(`value`: IResolvable) {
    unwrap(this).setLatestRevision(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Latest revision of the MSK configuration.
   */
  public open fun latestRevision(`value`: LatestRevisionProperty) {
    unwrap(this).setLatestRevision(`value`.let(LatestRevisionProperty.Companion::unwrap))
  }

  /**
   * Latest revision of the MSK configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff7fd235140ed3b9b780d2100e75ea7200fbe4458150e1be2c200f3f55992d89")
  public open fun latestRevision(`value`: LatestRevisionProperty.Builder.() -> Unit): Unit =
      latestRevision(LatestRevisionProperty(`value`))

  /**
   * The name of the configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contents of the `server.properties` file. When using the console, the SDK, or the AWS CLI , the
   * contents of `server.properties` can be in plaintext.
   */
  public open fun serverProperties(): String = unwrap(this).getServerProperties()

  /**
   * Contents of the `server.properties` file. When using the console, the SDK, or the AWS CLI , the
   * contents of `server.properties` can be in plaintext.
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
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     * @param description The description of the configuration. 
     */
    public fun description(description: String)

    /**
     * The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration.
     *
     * When you update the `KafkaVersionsList` property, AWS CloudFormation recreates a new
     * configuration with the updated property before deleting the old configuration. Such an update
     * requires a [resource
     * replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * . To successfully update `KafkaVersionsList` , you must also update the `Name` property in the
     * same operation.
     *
     * If your configuration is attached with any clusters created using the AWS Management Console
     * or AWS CLI , you'll need to manually delete the old configuration from the console after the
     * update completes.
     *
     * For more information, see [Can’t update KafkaVersionsList in MSK
     * configuration](https://docs.aws.amazon.com/msk/latest/developerguide/troubleshooting.html#troubleshoot-kafkaversionslist-cfn-update-failure)
     * in the *Amazon MSK Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration. 
     */
    public fun kafkaVersionsList(kafkaVersionsList: List<String>)

    /**
     * The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration.
     *
     * When you update the `KafkaVersionsList` property, AWS CloudFormation recreates a new
     * configuration with the updated property before deleting the old configuration. Such an update
     * requires a [resource
     * replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * . To successfully update `KafkaVersionsList` , you must also update the `Name` property in the
     * same operation.
     *
     * If your configuration is attached with any clusters created using the AWS Management Console
     * or AWS CLI , you'll need to manually delete the old configuration from the console after the
     * update completes.
     *
     * For more information, see [Can’t update KafkaVersionsList in MSK
     * configuration](https://docs.aws.amazon.com/msk/latest/developerguide/troubleshooting.html#troubleshoot-kafkaversionslist-cfn-update-failure)
     * in the *Amazon MSK Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration. 
     */
    public fun kafkaVersionsList(vararg kafkaVersionsList: String)

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    public fun latestRevision(latestRevision: IResolvable)

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    public fun latestRevision(latestRevision: LatestRevisionProperty)

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    public fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit)

    /**
     * The name of the configuration.
     *
     * Configuration names are strings that match the regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     * @param name The name of the configuration. 
     */
    public fun name(name: String)

    /**
     * Contents of the `server.properties` file. When using the console, the SDK, or the AWS CLI ,
     * the contents of `server.properties` can be in plaintext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     * @param serverProperties Contents of the `server.properties` file. When using the console, the
     * SDK, or the AWS CLI , the contents of `server.properties` can be in plaintext. 
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
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     * @param description The description of the configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration.
     *
     * When you update the `KafkaVersionsList` property, AWS CloudFormation recreates a new
     * configuration with the updated property before deleting the old configuration. Such an update
     * requires a [resource
     * replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * . To successfully update `KafkaVersionsList` , you must also update the `Name` property in the
     * same operation.
     *
     * If your configuration is attached with any clusters created using the AWS Management Console
     * or AWS CLI , you'll need to manually delete the old configuration from the console after the
     * update completes.
     *
     * For more information, see [Can’t update KafkaVersionsList in MSK
     * configuration](https://docs.aws.amazon.com/msk/latest/developerguide/troubleshooting.html#troubleshoot-kafkaversionslist-cfn-update-failure)
     * in the *Amazon MSK Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration. 
     */
    override fun kafkaVersionsList(kafkaVersionsList: List<String>) {
      cdkBuilder.kafkaVersionsList(kafkaVersionsList)
    }

    /**
     * The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration.
     *
     * When you update the `KafkaVersionsList` property, AWS CloudFormation recreates a new
     * configuration with the updated property before deleting the old configuration. Such an update
     * requires a [resource
     * replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * . To successfully update `KafkaVersionsList` , you must also update the `Name` property in the
     * same operation.
     *
     * If your configuration is attached with any clusters created using the AWS Management Console
     * or AWS CLI , you'll need to manually delete the old configuration from the console after the
     * update completes.
     *
     * For more information, see [Can’t update KafkaVersionsList in MSK
     * configuration](https://docs.aws.amazon.com/msk/latest/developerguide/troubleshooting.html#troubleshoot-kafkaversionslist-cfn-update-failure)
     * in the *Amazon MSK Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     * @param kafkaVersionsList The [versions of Apache
     * Kafka](https://docs.aws.amazon.com/msk/latest/developerguide/supported-kafka-versions.html) with
     * which you can use this MSK configuration. 
     */
    override fun kafkaVersionsList(vararg kafkaVersionsList: String): Unit =
        kafkaVersionsList(kafkaVersionsList.toList())

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    override fun latestRevision(latestRevision: IResolvable) {
      cdkBuilder.latestRevision(latestRevision.let(IResolvable.Companion::unwrap))
    }

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    override fun latestRevision(latestRevision: LatestRevisionProperty) {
      cdkBuilder.latestRevision(latestRevision.let(LatestRevisionProperty.Companion::unwrap))
    }

    /**
     * Latest revision of the MSK configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     * @param latestRevision Latest revision of the MSK configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5191f149a214eef0b3503b51de3a98cb0e8b852b1d529b6d7ab7c0d1f3e2e7c9")
    override fun latestRevision(latestRevision: LatestRevisionProperty.Builder.() -> Unit): Unit =
        latestRevision(LatestRevisionProperty(latestRevision))

    /**
     * The name of the configuration.
     *
     * Configuration names are strings that match the regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     * @param name The name of the configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contents of the `server.properties` file. When using the console, the SDK, or the AWS CLI ,
     * the contents of `server.properties` can be in plaintext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     * @param serverProperties Contents of the `server.properties` file. When using the console, the
     * SDK, or the AWS CLI , the contents of `server.properties` can be in plaintext. 
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
   * Describes a configuration revision.
   *
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
     * The time when the configuration revision was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-creationtime)
     */
    public fun creationTime(): String? = unwrap(this).getCreationTime()

    /**
     * The description of the configuration revision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The revision number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-revision)
     */
    public fun revision(): Number? = unwrap(this).getRevision()

    /**
     * A builder for [LatestRevisionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param creationTime The time when the configuration revision was created.
       */
      public fun creationTime(creationTime: String)

      /**
       * @param description The description of the configuration revision.
       */
      public fun description(description: String)

      /**
       * @param revision The revision number.
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.Builder =
          software.amazon.awscdk.services.msk.CfnConfiguration.LatestRevisionProperty.builder()

      /**
       * @param creationTime The time when the configuration revision was created.
       */
      override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      /**
       * @param description The description of the configuration revision.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param revision The revision number.
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
       * The time when the configuration revision was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-creationtime)
       */
      override fun creationTime(): String? = unwrap(this).getCreationTime()

      /**
       * The description of the configuration revision.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html#cfn-msk-configuration-latestrevision-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The revision number.
       *
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
