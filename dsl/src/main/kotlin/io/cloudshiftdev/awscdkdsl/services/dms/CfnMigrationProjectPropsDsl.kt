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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnMigrationProject
import software.amazon.awscdk.services.dms.CfnMigrationProjectProps

/**
 * Properties for defining a `CfnMigrationProject`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnMigrationProjectProps cfnMigrationProjectProps = CfnMigrationProjectProps.builder()
 * .description("description")
 * .instanceProfileArn("instanceProfileArn")
 * .instanceProfileIdentifier("instanceProfileIdentifier")
 * .instanceProfileName("instanceProfileName")
 * .migrationProjectCreationTime("migrationProjectCreationTime")
 * .migrationProjectIdentifier("migrationProjectIdentifier")
 * .migrationProjectName("migrationProjectName")
 * .schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty.builder()
 * .s3BucketPath("s3BucketPath")
 * .s3BucketRoleArn("s3BucketRoleArn")
 * .build())
 * .sourceDataProviderDescriptors(List.of(DataProviderDescriptorProperty.builder()
 * .dataProviderArn("dataProviderArn")
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetDataProviderDescriptors(List.of(DataProviderDescriptorProperty.builder()
 * .dataProviderArn("dataProviderArn")
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build()))
 * .transformationRules("transformationRules")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html)
 */
@CdkDslMarker
public class CfnMigrationProjectPropsDsl {
    private val cdkBuilder: CfnMigrationProjectProps.Builder = CfnMigrationProjectProps.builder()

    private val _sourceDataProviderDescriptors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetDataProviderDescriptors: MutableList<Any> = mutableListOf()

    /** @param description A user-friendly description of the migration project. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param instanceProfileArn The Amazon Resource Name (ARN) of the instance profile for your
     *   migration project.
     */
    public fun instanceProfileArn(instanceProfileArn: String) {
        cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile for your migration
     *   project.
     */
    public fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
        cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    /** @param instanceProfileName The name of the associated instance profile. */
    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param migrationProjectCreationTime The property describes a creating time of the migration
     *   project.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun migrationProjectCreationTime(migrationProjectCreationTime: String) {
        cdkBuilder.migrationProjectCreationTime(migrationProjectCreationTime)
    }

    /**
     * @param migrationProjectIdentifier The identifier of the migration project. Identifiers must
     *   begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't
     *   end with a hyphen, or contain two consecutive hyphens.
     */
    public fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
        cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    /** @param migrationProjectName The name of the migration project. */
    public fun migrationProjectName(migrationProjectName: String) {
        cdkBuilder.migrationProjectName(migrationProjectName)
    }

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     *   including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    public fun schemaConversionApplicationAttributes(
        schemaConversionApplicationAttributes: IResolvable
    ) {
        cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes)
    }

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     *   including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    public fun schemaConversionApplicationAttributes(
        schemaConversionApplicationAttributes:
            CfnMigrationProject.SchemaConversionApplicationAttributesProperty
    ) {
        cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes)
    }

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any) {
        _sourceDataProviderDescriptors.addAll(listOf(*sourceDataProviderDescriptors))
    }

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: Collection<Any>) {
        _sourceDataProviderDescriptors.addAll(sourceDataProviderDescriptors)
    }

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable) {
        cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any) {
        _targetDataProviderDescriptors.addAll(listOf(*targetDataProviderDescriptors))
    }

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: Collection<Any>) {
        _targetDataProviderDescriptors.addAll(targetDataProviderDescriptors)
    }

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     *   the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable) {
        cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors)
    }

    /**
     * @param transformationRules The settings in JSON format for migration rules. Migration rules
     *   make it possible for you to change the object names according to the rules that you
     *   specify. For example, you can change an object name to lowercase or uppercase, add or
     *   remove a prefix or suffix, or rename objects.
     */
    public fun transformationRules(transformationRules: String) {
        cdkBuilder.transformationRules(transformationRules)
    }

    public fun build(): CfnMigrationProjectProps {
        if (_sourceDataProviderDescriptors.isNotEmpty())
            cdkBuilder.sourceDataProviderDescriptors(_sourceDataProviderDescriptors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetDataProviderDescriptors.isNotEmpty())
            cdkBuilder.targetDataProviderDescriptors(_targetDataProviderDescriptors)
        return cdkBuilder.build()
    }
}
