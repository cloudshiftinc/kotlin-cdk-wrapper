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

package cloudshift.awscdk.dsl.services.m2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnApplication
import software.amazon.awscdk.services.m2.CfnApplicationProps
import software.amazon.awscdk.services.m2.CfnEnvironment
import software.amazon.awscdk.services.m2.CfnEnvironmentProps
import software.constructs.Construct

public object m2 {
    /**
     * Specifies a new application with given parameters. Requires an existing runtime environment
     * and application definition file.
     *
     * For information about application definitions, see the
     * [AWS Mainframe Modernization User Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .definition(DefinitionProperty.builder()
     * .content("content")
     * .s3Location("s3Location")
     * .build())
     * .engineType("engineType")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .roleArn("roleArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The application definition for a particular application.
     *
     * You can specify either inline JSON or an Amazon S3 bucket location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * DefinitionProperty definitionProperty = DefinitionProperty.builder()
     * .content("content")
     * .s3Location("s3Location")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html)
     */
    public inline fun cfnApplicationDefinitionProperty(
        block: CfnApplicationDefinitionPropertyDsl.() -> Unit = {}
    ): CfnApplication.DefinitionProperty {
        val builder = CfnApplicationDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .definition(DefinitionProperty.builder()
     * .content("content")
     * .s3Location("s3Location")
     * .build())
     * .engineType("engineType")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .roleArn("roleArn")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a runtime environment for a given runtime engine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .engineType("engineType")
     * .instanceType("instanceType")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .engineVersion("engineVersion")
     * .highAvailabilityConfig(HighAvailabilityConfigProperty.builder()
     * .desiredCapacity(123)
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .storageConfigurations(List.of(StorageConfigurationProperty.builder()
     * .efs(EfsStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .fsx(FsxStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .build()))
     * .subnetIds(List.of("subnetIds"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the storage configuration for an Amazon EFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * EfsStorageConfigurationProperty efsStorageConfigurationProperty =
     * EfsStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-efsstorageconfiguration.html)
     */
    public inline fun cfnEnvironmentEfsStorageConfigurationProperty(
        block: CfnEnvironmentEfsStorageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.EfsStorageConfigurationProperty {
        val builder = CfnEnvironmentEfsStorageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the storage configuration for an Amazon FSx file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * FsxStorageConfigurationProperty fsxStorageConfigurationProperty =
     * FsxStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html)
     */
    public inline fun cfnEnvironmentFsxStorageConfigurationProperty(
        block: CfnEnvironmentFsxStorageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.FsxStorageConfigurationProperty {
        val builder = CfnEnvironmentFsxStorageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the details of a high availability configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * HighAvailabilityConfigProperty highAvailabilityConfigProperty =
     * HighAvailabilityConfigProperty.builder()
     * .desiredCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-highavailabilityconfig.html)
     */
    public inline fun cfnEnvironmentHighAvailabilityConfigProperty(
        block: CfnEnvironmentHighAvailabilityConfigPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.HighAvailabilityConfigProperty {
        val builder = CfnEnvironmentHighAvailabilityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .engineType("engineType")
     * .instanceType("instanceType")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .engineVersion("engineVersion")
     * .highAvailabilityConfig(HighAvailabilityConfigProperty.builder()
     * .desiredCapacity(123)
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .storageConfigurations(List.of(StorageConfigurationProperty.builder()
     * .efs(EfsStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .fsx(FsxStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .build()))
     * .subnetIds(List.of("subnetIds"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the storage configuration for a runtime environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.m2.*;
     * StorageConfigurationProperty storageConfigurationProperty =
     * StorageConfigurationProperty.builder()
     * .efs(EfsStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .fsx(FsxStorageConfigurationProperty.builder()
     * .fileSystemId("fileSystemId")
     * .mountPoint("mountPoint")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html)
     */
    public inline fun cfnEnvironmentStorageConfigurationProperty(
        block: CfnEnvironmentStorageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.StorageConfigurationProperty {
        val builder = CfnEnvironmentStorageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
