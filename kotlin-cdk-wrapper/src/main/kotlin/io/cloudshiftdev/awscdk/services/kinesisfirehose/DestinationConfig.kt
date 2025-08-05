@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * An Amazon Data Firehose delivery stream destination configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * import software.constructs.*;
 * IDependable dependable;
 * DestinationConfig destinationConfig = DestinationConfig.builder()
 * .dependables(List.of(dependable))
 * .extendedS3DestinationConfiguration(ExtendedS3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .customTimeZone("customTimeZone")
 * .dataFormatConversionConfiguration(DataFormatConversionConfigurationProperty.builder()
 * .enabled(false)
 * .inputFormatConfiguration(InputFormatConfigurationProperty.builder()
 * .deserializer(DeserializerProperty.builder()
 * .hiveJsonSerDe(HiveJsonSerDeProperty.builder()
 * .timestampFormats(List.of("timestampFormats"))
 * .build())
 * .openXJsonSerDe(OpenXJsonSerDeProperty.builder()
 * .caseInsensitive(false)
 * .columnToJsonKeyMappings(Map.of(
 * "columnToJsonKeyMappingsKey", "columnToJsonKeyMappings"))
 * .convertDotsInJsonKeysToUnderscores(false)
 * .build())
 * .build())
 * .build())
 * .outputFormatConfiguration(OutputFormatConfigurationProperty.builder()
 * .serializer(SerializerProperty.builder()
 * .orcSerDe(OrcSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .bloomFilterColumns(List.of("bloomFilterColumns"))
 * .bloomFilterFalsePositiveProbability(123)
 * .compression("compression")
 * .dictionaryKeyThreshold(123)
 * .enablePadding(false)
 * .formatVersion("formatVersion")
 * .paddingTolerance(123)
 * .rowIndexStride(123)
 * .stripeSizeBytes(123)
 * .build())
 * .parquetSerDe(ParquetSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .compression("compression")
 * .enableDictionaryCompression(false)
 * .maxPaddingBytes(123)
 * .pageSizeBytes(123)
 * .writerVersion("writerVersion")
 * .build())
 * .build())
 * .build())
 * .schemaConfiguration(SchemaConfigurationProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * .versionId("versionId")
 * .build())
 * .build())
 * .dynamicPartitioningConfiguration(DynamicPartitioningConfigurationProperty.builder()
 * .enabled(false)
 * .retryOptions(RetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build())
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .fileExtension("fileExtension")
 * .prefix("prefix")
 * .processingConfiguration(ProcessingConfigurationProperty.builder()
 * .enabled(false)
 * .processors(List.of(ProcessorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(List.of(ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .build())
 * .s3BackupConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .prefix("prefix")
 * .build())
 * .s3BackupMode("s3BackupMode")
 * .build())
 * .build();
 * ```
 */
public interface DestinationConfig {
  /**
   * Any resources that were created by the destination when binding it to the stack that must be
   * deployed before the delivery stream is deployed.
   *
   * Default: []
   */
  public fun dependables(): List<IDependable> =
      unwrap(this).getDependables()?.map(IDependable::wrap) ?: emptyList()

  /**
   * S3 destination configuration properties.
   *
   * Default: - S3 destination is not used.
   */
  public fun extendedS3DestinationConfiguration():
      CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty? =
      unwrap(this).getExtendedS3DestinationConfiguration()?.let(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty::wrap)

  /**
   * A builder for [DestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dependables Any resources that were created by the destination when binding it to the
     * stack that must be deployed before the delivery stream is deployed.
     */
    public fun dependables(dependables: List<IDependable>)

    /**
     * @param dependables Any resources that were created by the destination when binding it to the
     * stack that must be deployed before the delivery stream is deployed.
     */
    public fun dependables(vararg dependables: IDependable)

    /**
     * @param extendedS3DestinationConfiguration S3 destination configuration properties.
     */
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty)

    /**
     * @param extendedS3DestinationConfiguration S3 destination configuration properties.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d029dd4162be42711ac77e410a02a48dbab0f010ec36558bbcd955865114264c")
    public
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DestinationConfig.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DestinationConfig.builder()

    /**
     * @param dependables Any resources that were created by the destination when binding it to the
     * stack that must be deployed before the delivery stream is deployed.
     */
    override fun dependables(dependables: List<IDependable>) {
      cdkBuilder.dependables(dependables.map(IDependable.Companion::unwrap))
    }

    /**
     * @param dependables Any resources that were created by the destination when binding it to the
     * stack that must be deployed before the delivery stream is deployed.
     */
    override fun dependables(vararg dependables: IDependable): Unit =
        dependables(dependables.toList())

    /**
     * @param extendedS3DestinationConfiguration S3 destination configuration properties.
     */
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty) {
      cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.let(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param extendedS3DestinationConfiguration S3 destination configuration properties.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d029dd4162be42711ac77e410a02a48dbab0f010ec36558bbcd955865114264c")
    override
        fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        extendedS3DestinationConfiguration(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty(extendedS3DestinationConfiguration))

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationConfig,
  ) : CdkObject(cdkObject),
      DestinationConfig {
    /**
     * Any resources that were created by the destination when binding it to the stack that must be
     * deployed before the delivery stream is deployed.
     *
     * Default: []
     */
    override fun dependables(): List<IDependable> =
        unwrap(this).getDependables()?.map(IDependable::wrap) ?: emptyList()

    /**
     * S3 destination configuration properties.
     *
     * Default: - S3 destination is not used.
     */
    override fun extendedS3DestinationConfiguration():
        CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty? =
        unwrap(this).getExtendedS3DestinationConfiguration()?.let(CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationConfig):
        DestinationConfig = CdkObjectWrappers.wrap(cdkObject) as? DestinationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationConfig):
        software.amazon.awscdk.services.kinesisfirehose.DestinationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.DestinationConfig
  }
}
