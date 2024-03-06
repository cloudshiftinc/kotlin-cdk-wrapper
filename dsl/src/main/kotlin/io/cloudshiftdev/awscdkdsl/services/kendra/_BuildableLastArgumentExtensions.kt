@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.kendra

import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Configuration information for altering document metadata and content during the document
 * ingestion process.
 */
public inline fun CfnDataSource.setCustomDocumentEnrichmentConfiguration(
    block: CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl()
    builder.apply(block)
    return setCustomDocumentEnrichmentConfiguration(builder.build())
}

/** Configuration information for an Amazon Kendra data source. */
public inline fun CfnDataSource.setDataSourceConfiguration(
    block: CfnDataSourceDataSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDataSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setDataSourceConfiguration(builder.build())
}

/** The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. */
public inline fun CfnFaq.setS3Path(block: CfnFaqS3PathPropertyDsl.() -> Unit = {}) {
    val builder = CfnFaqS3PathPropertyDsl()
    builder.apply(block)
    return setS3Path(builder.build())
}

/** Specifies additional capacity units configured for your Enterprise Edition index. */
public inline fun CfnIndex.setCapacityUnits(
    block: CfnIndexCapacityUnitsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIndexCapacityUnitsConfigurationPropertyDsl()
    builder.apply(block)
    return setCapacityUnits(builder.build())
}

/**
 * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon
 * Kendra.
 */
public inline fun CfnIndex.setServerSideEncryptionConfiguration(
    block: CfnIndexServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIndexServerSideEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setServerSideEncryptionConfiguration(builder.build())
}
