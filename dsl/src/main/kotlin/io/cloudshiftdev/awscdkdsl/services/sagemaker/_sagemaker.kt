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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnApp
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
import software.amazon.awscdk.services.sagemaker.CfnAppProps
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
import software.amazon.awscdk.services.sagemaker.CfnDeviceProps
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.amazon.awscdk.services.sagemaker.CfnDomainProps
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.amazon.awscdk.services.sagemaker.CfnImageProps
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
import software.amazon.awscdk.services.sagemaker.CfnModelProps
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.amazon.awscdk.services.sagemaker.CfnProjectProps
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import software.constructs.Construct

public object sagemaker {
    /**
     * Creates a running app for the specified UserProfile.
     *
     * This operation is automatically invoked by Amazon SageMaker upon access to the associated
     * Domain, and when new kernel configurations are selected by the user. A user may have multiple
     * Apps active simultaneously.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
     * .appName("appName")
     * .appType("appType")
     * .domainId("domainId")
     * .userProfileName("userProfileName")
     * // the properties below are optional
     * .resourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html)
     */
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a configuration for running a SageMaker image as a KernelGateway app.
     *
     * The configuration specifies the Amazon Elastic File System storage volume on the image, and a
     * list of the kernels in the image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnAppImageConfig cfnAppImageConfig = CfnAppImageConfig.Builder.create(this,
     * "MyCfnAppImageConfig")
     * .appImageConfigName("appImageConfigName")
     * // the properties below are optional
     * .jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty.builder()
     * .containerConfig(ContainerConfigProperty.builder()
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .kernelGatewayImageConfig(KernelGatewayImageConfigProperty.builder()
     * .kernelSpecs(List.of(KernelSpecProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .displayName("displayName")
     * .build()))
     * // the properties below are optional
     * .fileSystemConfig(FileSystemConfigProperty.builder()
     * .defaultGid(123)
     * .defaultUid(123)
     * .mountPath("mountPath")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html)
     */
    public inline fun cfnAppImageConfig(
        scope: Construct,
        id: String,
        block: CfnAppImageConfigDsl.() -> Unit = {},
    ): CfnAppImageConfig {
        val builder = CfnAppImageConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration used to run the application image container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ContainerConfigProperty containerConfigProperty = ContainerConfigProperty.builder()
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html)
     */
    public inline fun cfnAppImageConfigContainerConfigProperty(
        block: CfnAppImageConfigContainerConfigPropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.ContainerConfigProperty {
        val builder = CfnAppImageConfigContainerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The environment variables to set in the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomImageContainerEnvironmentVariableProperty customImageContainerEnvironmentVariableProperty
     * = CustomImageContainerEnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html)
     */
    public inline fun cfnAppImageConfigCustomImageContainerEnvironmentVariableProperty(
        block: CfnAppImageConfigCustomImageContainerEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty {
        val builder = CfnAppImageConfigCustomImageContainerEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Elastic File System storage configuration for a SageMaker image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
     * .defaultGid(123)
     * .defaultUid(123)
     * .mountPath("mountPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html)
     */
    public inline fun cfnAppImageConfigFileSystemConfigProperty(
        block: CfnAppImageConfigFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.FileSystemConfigProperty {
        val builder = CfnAppImageConfigFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a
     * JupyterLab app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterLabAppImageConfigProperty jupyterLabAppImageConfigProperty =
     * JupyterLabAppImageConfigProperty.builder()
     * .containerConfig(ContainerConfigProperty.builder()
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-jupyterlabappimageconfig.html)
     */
    public inline fun cfnAppImageConfigJupyterLabAppImageConfigProperty(
        block: CfnAppImageConfigJupyterLabAppImageConfigPropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.JupyterLabAppImageConfigProperty {
        val builder = CfnAppImageConfigJupyterLabAppImageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a
     * KernelGateway app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * KernelGatewayImageConfigProperty kernelGatewayImageConfigProperty =
     * KernelGatewayImageConfigProperty.builder()
     * .kernelSpecs(List.of(KernelSpecProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .displayName("displayName")
     * .build()))
     * // the properties below are optional
     * .fileSystemConfig(FileSystemConfigProperty.builder()
     * .defaultGid(123)
     * .defaultUid(123)
     * .mountPath("mountPath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html)
     */
    public inline fun cfnAppImageConfigKernelGatewayImageConfigProperty(
        block: CfnAppImageConfigKernelGatewayImageConfigPropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.KernelGatewayImageConfigProperty {
        val builder = CfnAppImageConfigKernelGatewayImageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The specification of a Jupyter kernel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * KernelSpecProperty kernelSpecProperty = KernelSpecProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .displayName("displayName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html)
     */
    public inline fun cfnAppImageConfigKernelSpecProperty(
        block: CfnAppImageConfigKernelSpecPropertyDsl.() -> Unit = {}
    ): CfnAppImageConfig.KernelSpecProperty {
        val builder = CfnAppImageConfigKernelSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAppImageConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnAppImageConfigProps cfnAppImageConfigProps = CfnAppImageConfigProps.builder()
     * .appImageConfigName("appImageConfigName")
     * // the properties below are optional
     * .jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty.builder()
     * .containerConfig(ContainerConfigProperty.builder()
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .kernelGatewayImageConfig(KernelGatewayImageConfigProperty.builder()
     * .kernelSpecs(List.of(KernelSpecProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .displayName("displayName")
     * .build()))
     * // the properties below are optional
     * .fileSystemConfig(FileSystemConfigProperty.builder()
     * .defaultGid(123)
     * .defaultUid(123)
     * .mountPath("mountPath")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html)
     */
    public inline fun cfnAppImageConfigProps(
        block: CfnAppImageConfigPropsDsl.() -> Unit = {}
    ): CfnAppImageConfigProps {
        val builder = CfnAppImageConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnAppProps cfnAppProps = CfnAppProps.builder()
     * .appName("appName")
     * .appType("appType")
     * .domainId("domainId")
     * .userProfileName("userProfileName")
     * // the properties below are optional
     * .resourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html)
     */
    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html)
     */
    public inline fun cfnAppResourceSpecProperty(
        block: CfnAppResourceSpecPropertyDsl.() -> Unit = {}
    ): CfnApp.ResourceSpecProperty {
        val builder = CfnAppResourceSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Git repository as a resource in your SageMaker account.
     *
     * You can associate the repository with notebook instances so that you can use Git source
     * control for the notebooks you create. The Git repository is a resource in your SageMaker
     * account, so it can be associated with more than one notebook instance, and it persists
     * independently from the lifecycle of any notebook instances it is associated with.
     *
     * The repository can be hosted either in
     * [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in
     * any other Git repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnCodeRepository cfnCodeRepository = CfnCodeRepository.Builder.create(this,
     * "MyCfnCodeRepository")
     * .gitConfig(GitConfigProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * // the properties below are optional
     * .branch("branch")
     * .secretArn("secretArn")
     * .build())
     * // the properties below are optional
     * .codeRepositoryName("codeRepositoryName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html)
     */
    public inline fun cfnCodeRepository(
        scope: Construct,
        id: String,
        block: CfnCodeRepositoryDsl.() -> Unit = {},
    ): CfnCodeRepository {
        val builder = CfnCodeRepositoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration details for a Git repository in your AWS account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * GitConfigProperty gitConfigProperty = GitConfigProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * // the properties below are optional
     * .branch("branch")
     * .secretArn("secretArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html)
     */
    public inline fun cfnCodeRepositoryGitConfigProperty(
        block: CfnCodeRepositoryGitConfigPropertyDsl.() -> Unit = {}
    ): CfnCodeRepository.GitConfigProperty {
        val builder = CfnCodeRepositoryGitConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCodeRepository`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnCodeRepositoryProps cfnCodeRepositoryProps = CfnCodeRepositoryProps.builder()
     * .gitConfig(GitConfigProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * // the properties below are optional
     * .branch("branch")
     * .secretArn("secretArn")
     * .build())
     * // the properties below are optional
     * .codeRepositoryName("codeRepositoryName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html)
     */
    public inline fun cfnCodeRepositoryProps(
        block: CfnCodeRepositoryPropsDsl.() -> Unit = {}
    ): CfnCodeRepositoryProps {
        val builder = CfnCodeRepositoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a definition for a job that monitors data quality and drift.
     *
     * For information about model monitor, see
     * [Amazon SageMaker Model Monitor](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDataQualityJobDefinition cfnDataQualityJobDefinition =
     * CfnDataQualityJobDefinition.Builder.create(this, "MyCfnDataQualityJobDefinition")
     * .dataQualityAppSpecification(DataQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .dataQualityJobInput(DataQualityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build())
     * .dataQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .dataQualityBaselineConfig(DataQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html)
     */
    public inline fun cfnDataQualityJobDefinition(
        scope: Construct,
        id: String,
        block: CfnDataQualityJobDefinitionDsl.() -> Unit = {},
    ): CfnDataQualityJobDefinition {
        val builder = CfnDataQualityJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the batch transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-batchtransforminput.html)
     */
    public inline fun cfnDataQualityJobDefinitionBatchTransformInputProperty(
        block: CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.BatchTransformInputProperty {
        val builder = CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the cluster of resources used to run the processing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-clusterconfig.html)
     */
    public inline fun cfnDataQualityJobDefinitionClusterConfigProperty(
        block: CfnDataQualityJobDefinitionClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.ClusterConfigProperty {
        val builder = CfnDataQualityJobDefinitionClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The constraints resource for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-constraintsresource.html)
     */
    public inline fun cfnDataQualityJobDefinitionConstraintsResourceProperty(
        block: CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.ConstraintsResourceProperty {
        val builder = CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CSV format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .header(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-csv.html)
     */
    public inline fun cfnDataQualityJobDefinitionCsvProperty(
        block: CfnDataQualityJobDefinitionCsvPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.CsvProperty {
        val builder = CfnDataQualityJobDefinitionCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the container that a data quality monitoring job runs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataQualityAppSpecificationProperty dataQualityAppSpecificationProperty =
     * DataQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualityappspecification.html)
     */
    public inline fun cfnDataQualityJobDefinitionDataQualityAppSpecificationProperty(
        block: CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty {
        val builder = CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for monitoring constraints and monitoring statistics.
     *
     * These baseline resources are compared against the results of the current job from the series
     * of jobs scheduled to collect data periodically.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataQualityBaselineConfigProperty dataQualityBaselineConfigProperty =
     * DataQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualitybaselineconfig.html)
     */
    public inline fun cfnDataQualityJobDefinitionDataQualityBaselineConfigProperty(
        block: CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty {
        val builder = CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input for the data quality monitoring job.
     *
     * Currently endpoints are supported for input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataQualityJobInputProperty dataQualityJobInputProperty = DataQualityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualityjobinput.html)
     */
    public inline fun cfnDataQualityJobDefinitionDataQualityJobInputProperty(
        block: CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.DataQualityJobInputProperty {
        val builder = CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset format of the data to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-datasetformat.html)
     */
    public inline fun cfnDataQualityJobDefinitionDatasetFormatProperty(
        block: CfnDataQualityJobDefinitionDatasetFormatPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.DatasetFormatProperty {
        val builder = CfnDataQualityJobDefinitionDatasetFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-endpointinput.html)
     */
    public inline fun cfnDataQualityJobDefinitionEndpointInputProperty(
        block: CfnDataQualityJobDefinitionEndpointInputPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.EndpointInputProperty {
        val builder = CfnDataQualityJobDefinitionEndpointInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Json format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JsonProperty jsonProperty = JsonProperty.builder()
     * .line(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-json.html)
     */
    public inline fun cfnDataQualityJobDefinitionJsonProperty(
        block: CfnDataQualityJobDefinitionJsonPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.JsonProperty {
        val builder = CfnDataQualityJobDefinitionJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
     * MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-monitoringoutputconfig.html)
     */
    public inline fun cfnDataQualityJobDefinitionMonitoringOutputConfigProperty(
        block: CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.MonitoringOutputConfigProperty {
        val builder = CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output object for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-monitoringoutput.html)
     */
    public inline fun cfnDataQualityJobDefinitionMonitoringOutputProperty(
        block: CfnDataQualityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.MonitoringOutputProperty {
        val builder = CfnDataQualityJobDefinitionMonitoringOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-monitoringresources.html)
     */
    public inline fun cfnDataQualityJobDefinitionMonitoringResourcesProperty(
        block: CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.MonitoringResourcesProperty {
        val builder = CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Networking options for a job, such as network traffic encryption between containers, whether
     * to allow inbound and outbound network calls to and from containers, and the VPC subnets and
     * security groups to use for VPC-enabled jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-networkconfig.html)
     */
    public inline fun cfnDataQualityJobDefinitionNetworkConfigProperty(
        block: CfnDataQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.NetworkConfigProperty {
        val builder = CfnDataQualityJobDefinitionNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataQualityJobDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDataQualityJobDefinitionProps cfnDataQualityJobDefinitionProps =
     * CfnDataQualityJobDefinitionProps.builder()
     * .dataQualityAppSpecification(DataQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .dataQualityJobInput(DataQualityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build())
     * .dataQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .dataQualityBaselineConfig(DataQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-dataqualityjobdefinition.html)
     */
    public inline fun cfnDataQualityJobDefinitionProps(
        block: CfnDataQualityJobDefinitionPropsDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinitionProps {
        val builder = CfnDataQualityJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-s3output.html)
     */
    public inline fun cfnDataQualityJobDefinitionS3OutputProperty(
        block: CfnDataQualityJobDefinitionS3OutputPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.S3OutputProperty {
        val builder = CfnDataQualityJobDefinitionS3OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The statistics resource for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StatisticsResourceProperty statisticsResourceProperty = StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-statisticsresource.html)
     */
    public inline fun cfnDataQualityJobDefinitionStatisticsResourceProperty(
        block: CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.StatisticsResourceProperty {
        val builder = CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job or model compilation job can run.
     *
     * It also specifies how long a managed spot training job has to complete. When the job reaches
     * the time limit, SageMaker ends the training or compilation job. Use this API to cap model
     * training costs.
     *
     * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
     * termination for 120 seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     *
     * The training algorithms provided by SageMaker automatically save the intermediate results of
     * a model training job when possible. This attempt to save artifacts is only a best effort case
     * as model might not be in a state from which it can be saved. For example, if training has
     * just started, the model might not be ready to save. When saved, this intermediate data is a
     * valid model artifact. You can use it to create a model with `CreateModel` .
     *
     * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
     * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
     * complete.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-stoppingcondition.html)
     */
    public inline fun cfnDataQualityJobDefinitionStoppingConditionProperty(
        block: CfnDataQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.StoppingConditionProperty {
        val builder = CfnDataQualityJobDefinitionStoppingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-vpcconfig.html)
     */
    public inline fun cfnDataQualityJobDefinitionVpcConfigProperty(
        block: CfnDataQualityJobDefinitionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnDataQualityJobDefinition.VpcConfigProperty {
        val builder = CfnDataQualityJobDefinitionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::Device` resource is an Amazon SageMaker resource type that allows you to
     * register your Devices against an existing SageMaker Edge Manager DeviceFleet.
     *
     * Each device must be listed individually in the CFN specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
     * .deviceFleetName("deviceFleetName")
     * // the properties below are optional
     * .device(DeviceProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .description("description")
     * .iotThingName("iotThingName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html)
     */
    public inline fun cfnDevice(
        scope: Construct,
        id: String,
        block: CfnDeviceDsl.() -> Unit = {},
    ): CfnDevice {
        val builder = CfnDeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information of a particular device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DeviceProperty deviceProperty = DeviceProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .description("description")
     * .iotThingName("iotThingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html)
     */
    public inline fun cfnDeviceDeviceProperty(
        block: CfnDeviceDevicePropertyDsl.() -> Unit = {}
    ): CfnDevice.DeviceProperty {
        val builder = CfnDeviceDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::DeviceFleet` resource is an Amazon SageMaker resource type that allows
     * you to create a DeviceFleet that manages your SageMaker Edge Manager Devices.
     *
     * You must register your devices against the `DeviceFleet` separately.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDeviceFleet cfnDeviceFleet = CfnDeviceFleet.Builder.create(this, "MyCfnDeviceFleet")
     * .deviceFleetName("deviceFleetName")
     * .outputConfig(EdgeOutputConfigProperty.builder()
     * .s3OutputLocation("s3OutputLocation")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html)
     */
    public inline fun cfnDeviceFleet(
        scope: Construct,
        id: String,
        block: CfnDeviceFleetDsl.() -> Unit = {},
    ): CfnDeviceFleet {
        val builder = CfnDeviceFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EdgeOutputConfigProperty edgeOutputConfigProperty = EdgeOutputConfigProperty.builder()
     * .s3OutputLocation("s3OutputLocation")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html)
     */
    public inline fun cfnDeviceFleetEdgeOutputConfigProperty(
        block: CfnDeviceFleetEdgeOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnDeviceFleet.EdgeOutputConfigProperty {
        val builder = CfnDeviceFleetEdgeOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeviceFleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDeviceFleetProps cfnDeviceFleetProps = CfnDeviceFleetProps.builder()
     * .deviceFleetName("deviceFleetName")
     * .outputConfig(EdgeOutputConfigProperty.builder()
     * .s3OutputLocation("s3OutputLocation")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html)
     */
    public inline fun cfnDeviceFleetProps(
        block: CfnDeviceFleetPropsDsl.() -> Unit = {}
    ): CfnDeviceFleetProps {
        val builder = CfnDeviceFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDevice`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
     * .deviceFleetName("deviceFleetName")
     * // the properties below are optional
     * .device(DeviceProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .description("description")
     * .iotThingName("iotThingName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html)
     */
    public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
        val builder = CfnDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a `Domain` .
     *
     * A domain consists of an associated Amazon Elastic File System volume, a list of authorized
     * users, and a variety of security, application, policy, and Amazon Virtual Private Cloud (VPC)
     * configurations. Users within a domain can share notebook files and other artifacts with each
     * other.
     *
     * *EFS storage*
     *
     * When a domain is created, an EFS volume is created for use by all of the users within the
     * domain. Each user receives a private home directory within the EFS volume for notebooks, Git
     * repositories, and data files.
     *
     * SageMaker uses the AWS Key Management Service ( AWS KMS) to encrypt the EFS volume attached
     * to the domain with an AWS managed key by default. For more control, you can specify a
     * customer managed key. For more information, see
     * [Protect Data at Rest Using Encryption](https://docs.aws.amazon.com/sagemaker/latest/dg/encryption-at-rest.html)
     * .
     *
     * *VPC configuration*
     *
     * All traffic between the domain and the Amazon EFS volume is through the specified VPC and
     * subnets. For other traffic, you can specify the `AppNetworkAccessType` parameter.
     * `AppNetworkAccessType` corresponds to the network access type that you choose when you
     * onboard to the domain. The following options are available:
     * * `PublicInternetOnly` - Non-EFS traffic goes through a VPC managed by Amazon SageMaker,
     *   which allows internet access. This is the default value.
     * * `VpcOnly` - All traffic is through the specified VPC and subnets. Internet access is
     *   disabled by default. To allow internet access, you must specify a NAT gateway.
     *
     * When internet access is disabled, you won't be able to run a Amazon SageMaker Studio notebook
     * or to train or host models unless your VPC has an interface endpoint to the SageMaker API and
     * runtime or a NAT gateway and your security groups allow outbound connections.
     *
     * NFS traffic over TCP on port 2049 needs to be allowed in both inbound and outbound rules in
     * order to launch a Amazon SageMaker Studio app successfully.
     *
     * For more information, see
     * [Connect Amazon SageMaker Studio Notebooks to Resources in a VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-notebooks-and-internet-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .authMode("authMode")
     * .defaultUserSettings(UserSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build())
     * .domainName("domainName")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .appNetworkAccessType("appNetworkAccessType")
     * .appSecurityGroupManagement("appSecurityGroupManagement")
     * .defaultSpaceSettings(DefaultSpaceSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .domainSettings(DomainSettingsProperty.builder()
     * .dockerSettings(DockerSettingsProperty.builder()
     * .enableDockerAccess("enableDockerAccess")
     * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
     * .build())
     * .rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty.builder()
     * .domainExecutionRoleArn("domainExecutionRoleArn")
     * // the properties below are optional
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .rStudioConnectUrl("rStudioConnectUrl")
     * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Code Editor application settings.
     *
     * For more information about Code Editor, see
     * [Get started with Code Editor in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/code-editor.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CodeEditorAppSettingsProperty codeEditorAppSettingsProperty =
     * CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html)
     */
    public inline fun cfnDomainCodeEditorAppSettingsProperty(
        block: CfnDomainCodeEditorAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.CodeEditorAppSettingsProperty {
        val builder = CfnDomainCodeEditorAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Git repository that SageMaker automatically displays to users for cloning in the
     * JupyterServer application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-coderepository.html)
     */
    public inline fun cfnDomainCodeRepositoryProperty(
        block: CfnDomainCodeRepositoryPropertyDsl.() -> Unit = {}
    ): CfnDomain.CodeRepositoryProperty {
        val builder = CfnDomainCodeRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for assigning a custom file system to a user profile or space for an Amazon
     * SageMaker Domain.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomFileSystemConfigProperty customFileSystemConfigProperty =
     * CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customfilesystemconfig.html)
     */
    public inline fun cfnDomainCustomFileSystemConfigProperty(
        block: CfnDomainCustomFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.CustomFileSystemConfigProperty {
        val builder = CfnDomainCustomFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom SageMaker image.
     *
     * For more information, see
     * [Bring your own SageMaker image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomImageProperty customImageProperty = CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html)
     */
    public inline fun cfnDomainCustomImageProperty(
        block: CfnDomainCustomImagePropertyDsl.() -> Unit = {}
    ): CfnDomain.CustomImageProperty {
        val builder = CfnDomainCustomImagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the POSIX identity that is used for file system operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomPosixUserConfigProperty customPosixUserConfigProperty =
     * CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html)
     */
    public inline fun cfnDomainCustomPosixUserConfigProperty(
        block: CfnDomainCustomPosixUserConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.CustomPosixUserConfigProperty {
        val builder = CfnDomainCustomPosixUserConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of default EBS storage settings that applies to private spaces created within a
     * domain or user profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DefaultEbsStorageSettingsProperty defaultEbsStorageSettingsProperty =
     * DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html)
     */
    public inline fun cfnDomainDefaultEbsStorageSettingsProperty(
        block: CfnDomainDefaultEbsStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DefaultEbsStorageSettingsProperty {
        val builder = CfnDomainDefaultEbsStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DefaultSpaceSettingsProperty defaultSpaceSettingsProperty =
     * DefaultSpaceSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html)
     */
    public inline fun cfnDomainDefaultSpaceSettingsProperty(
        block: CfnDomainDefaultSpaceSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DefaultSpaceSettingsProperty {
        val builder = CfnDomainDefaultSpaceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The default storage settings for a private space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DefaultSpaceStorageSettingsProperty defaultSpaceStorageSettingsProperty =
     * DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacestoragesettings.html)
     */
    public inline fun cfnDomainDefaultSpaceStorageSettingsProperty(
        block: CfnDomainDefaultSpaceStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DefaultSpaceStorageSettingsProperty {
        val builder = CfnDomainDefaultSpaceStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that configure the domain's Docker interaction.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DockerSettingsProperty dockerSettingsProperty = DockerSettingsProperty.builder()
     * .enableDockerAccess("enableDockerAccess")
     * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html)
     */
    public inline fun cfnDomainDockerSettingsProperty(
        block: CfnDomainDockerSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DockerSettingsProperty {
        val builder = CfnDomainDockerSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DomainSettingsProperty domainSettingsProperty = DomainSettingsProperty.builder()
     * .dockerSettings(DockerSettingsProperty.builder()
     * .enableDockerAccess("enableDockerAccess")
     * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
     * .build())
     * .rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty.builder()
     * .domainExecutionRoleArn("domainExecutionRoleArn")
     * // the properties below are optional
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .rStudioConnectUrl("rStudioConnectUrl")
     * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html)
     */
    public inline fun cfnDomainDomainSettingsProperty(
        block: CfnDomainDomainSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DomainSettingsProperty {
        val builder = CfnDomainDomainSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for assigning a custom Amazon EFS file system to a user profile or space for an
     * Amazon SageMaker Domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EFSFileSystemConfigProperty eFSFileSystemConfigProperty = EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html)
     */
    public inline fun cfnDomainEFSFileSystemConfigProperty(
        block: CfnDomainEFSFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.EFSFileSystemConfigProperty {
        val builder = CfnDomainEFSFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the JupyterLab application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterLabAppSettingsProperty jupyterLabAppSettingsProperty =
     * JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html)
     */
    public inline fun cfnDomainJupyterLabAppSettingsProperty(
        block: CfnDomainJupyterLabAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.JupyterLabAppSettingsProperty {
        val builder = CfnDomainJupyterLabAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The JupyterServer app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
     * JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterserverappsettings.html)
     */
    public inline fun cfnDomainJupyterServerAppSettingsProperty(
        block: CfnDomainJupyterServerAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.JupyterServerAppSettingsProperty {
        val builder = CfnDomainJupyterServerAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The KernelGateway app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
     * KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html)
     */
    public inline fun cfnDomainKernelGatewayAppSettingsProperty(
        block: CfnDomainKernelGatewayAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.KernelGatewayAppSettingsProperty {
        val builder = CfnDomainKernelGatewayAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .authMode("authMode")
     * .defaultUserSettings(UserSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build())
     * .domainName("domainName")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .appNetworkAccessType("appNetworkAccessType")
     * .appSecurityGroupManagement("appSecurityGroupManagement")
     * .defaultSpaceSettings(DefaultSpaceSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .domainSettings(DomainSettingsProperty.builder()
     * .dockerSettings(DockerSettingsProperty.builder()
     * .enableDockerAccess("enableDockerAccess")
     * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
     * .build())
     * .rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty.builder()
     * .domainExecutionRoleArn("domainExecutionRoleArn")
     * // the properties below are optional
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .rStudioConnectUrl("rStudioConnectUrl")
     * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that apply to an `RSessionGateway` app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RSessionAppSettingsProperty rSessionAppSettingsProperty = RSessionAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html)
     */
    public inline fun cfnDomainRSessionAppSettingsProperty(
        block: CfnDomainRSessionAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.RSessionAppSettingsProperty {
        val builder = CfnDomainRSessionAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that configure user interaction with the `RStudioServerPro` app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RStudioServerProAppSettingsProperty rStudioServerProAppSettingsProperty =
     * RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html)
     */
    public inline fun cfnDomainRStudioServerProAppSettingsProperty(
        block: CfnDomainRStudioServerProAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.RStudioServerProAppSettingsProperty {
        val builder = CfnDomainRStudioServerProAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that configure the `RStudioServerPro` Domain-level app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RStudioServerProDomainSettingsProperty rStudioServerProDomainSettingsProperty =
     * RStudioServerProDomainSettingsProperty.builder()
     * .domainExecutionRoleArn("domainExecutionRoleArn")
     * // the properties below are optional
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .rStudioConnectUrl("rStudioConnectUrl")
     * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html)
     */
    public inline fun cfnDomainRStudioServerProDomainSettingsProperty(
        block: CfnDomainRStudioServerProDomainSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.RStudioServerProDomainSettingsProperty {
        val builder = CfnDomainRStudioServerProDomainSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html)
     */
    public inline fun cfnDomainResourceSpecProperty(
        block: CfnDomainResourceSpecPropertyDsl.() -> Unit = {}
    ): CfnDomain.ResourceSpecProperty {
        val builder = CfnDomainResourceSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options when sharing an Amazon SageMaker Studio notebook.
     *
     * These settings are specified as part of `DefaultUserSettings` when the
     * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
     * API is called, and as part of `UserSettings` when the
     * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
     * API is called.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SharingSettingsProperty sharingSettingsProperty = SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html)
     */
    public inline fun cfnDomainSharingSettingsProperty(
        block: CfnDomainSharingSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.SharingSettingsProperty {
        val builder = CfnDomainSharingSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * These settings are specified when the
     * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
     * API is called, and as `DefaultUserSettings` when the
     * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
     * API is called.
     *
     * `SecurityGroups` is aggregated when specified in both calls. For all other settings in
     * `UserSettings` , the values specified in `CreateUserProfile` take precedence over those
     * specified in `CreateDomain` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * UserSettingsProperty userSettingsProperty = UserSettingsProperty.builder()
     * .executionRole("executionRole")
     * // the properties below are optional
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .lifecycleConfigArn("lifecycleConfigArn")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html)
     */
    public inline fun cfnDomainUserSettingsProperty(
        block: CfnDomainUserSettingsPropertyDsl.() -> Unit = {}
    ): CfnDomain.UserSettingsProperty {
        val builder = CfnDomainUserSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::SageMaker::Endpoint` resource to create an endpoint using the specified
     * configuration in the request.
     *
     * Amazon SageMaker uses the endpoint to provision resources and deploy models. You create the
     * endpoint configuration with the
     * [AWS::SageMaker::EndpointConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     * resource. For more information, see
     * [Deploy a Model on Amazon SageMaker Hosting Services](https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works-hosting.html)
     * in the *Amazon SageMaker Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
     * .endpointConfigName("endpointConfigName")
     * // the properties below are optional
     * .deploymentConfig(DeploymentConfigProperty.builder()
     * .autoRollbackConfiguration(AutoRollbackConfigProperty.builder()
     * .alarms(List.of(AlarmProperty.builder()
     * .alarmName("alarmName")
     * .build()))
     * .build())
     * .blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty.builder()
     * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .canarySize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .linearStepSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * .build())
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .terminationWaitInSeconds(123)
     * .build())
     * .rollingUpdatePolicy(RollingUpdatePolicyProperty.builder()
     * .maximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .build())
     * .build())
     * .endpointName("endpointName")
     * .excludeRetainedVariantProperties(List.of(VariantPropertyProperty.builder()
     * .variantPropertyType("variantPropertyType")
     * .build()))
     * .retainAllVariantProperties(false)
     * .retainDeploymentConfig(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html)
     */
    public inline fun cfnEndpoint(
        scope: Construct,
        id: String,
        block: CfnEndpointDsl.() -> Unit = {},
    ): CfnEndpoint {
        val builder = CfnEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Amazon CloudWatch alarm configured to monitor metrics on an endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AlarmProperty alarmProperty = AlarmProperty.builder()
     * .alarmName("alarmName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-alarm.html)
     */
    public inline fun cfnEndpointAlarmProperty(
        block: CfnEndpointAlarmPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.AlarmProperty {
        val builder = CfnEndpointAlarmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Automatic rollback configuration for handling endpoint deployment failures and recovery.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AutoRollbackConfigProperty autoRollbackConfigProperty = AutoRollbackConfigProperty.builder()
     * .alarms(List.of(AlarmProperty.builder()
     * .alarmName("alarmName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-autorollbackconfig.html)
     */
    public inline fun cfnEndpointAutoRollbackConfigProperty(
        block: CfnEndpointAutoRollbackConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.AutoRollbackConfigProperty {
        val builder = CfnEndpointAutoRollbackConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Update policy for a blue/green deployment.
     *
     * If this update policy is specified, SageMaker creates a new fleet during the deployment while
     * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the
     * specified traffic routing configuration. Only one update policy should be used in the
     * deployment configuration. If no update policy is specified, SageMaker uses a blue/green
     * deployment strategy with all at once traffic shifting by default.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BlueGreenUpdatePolicyProperty blueGreenUpdatePolicyProperty =
     * BlueGreenUpdatePolicyProperty.builder()
     * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .canarySize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .linearStepSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * .build())
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .terminationWaitInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-bluegreenupdatepolicy.html)
     */
    public inline fun cfnEndpointBlueGreenUpdatePolicyProperty(
        block: CfnEndpointBlueGreenUpdatePolicyPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.BlueGreenUpdatePolicyProperty {
        val builder = CfnEndpointBlueGreenUpdatePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the type and size of the endpoint capacity to activate for a blue/green deployment,
     * a rolling deployment, or a rollback strategy.
     *
     * You can specify your batches as either instance count or the overall percentage or your
     * fleet.
     *
     * For a rollback strategy, if you don't specify the fields in this object, or if you set the
     * `Value` to 100%, then SageMaker uses a blue/green rollback strategy and rolls all traffic
     * back to the blue fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CapacitySizeProperty capacitySizeProperty = CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-capacitysize.html)
     */
    public inline fun cfnEndpointCapacitySizeProperty(
        block: CfnEndpointCapacitySizePropertyDsl.() -> Unit = {}
    ): CfnEndpoint.CapacitySizeProperty {
        val builder = CfnEndpointCapacitySizePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::EndpointConfig` resource creates a configuration for an Amazon SageMaker
     * endpoint.
     *
     * For more information, see
     * [CreateEndpointConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)
     * in the *SageMaker Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnEndpointConfig cfnEndpointConfig = CfnEndpointConfig.Builder.create(this,
     * "MyCfnEndpointConfig")
     * .productionVariants(List.of(ProductionVariantProperty.builder()
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType("acceleratorType")
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .enableSsmAccess(false)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .instanceType("instanceType")
     * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build())
     * .modelDataDownloadTimeoutInSeconds(123)
     * .modelName("modelName")
     * .routingConfig(RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build())
     * .serverlessConfig(ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build())
     * .volumeSizeInGb(123)
     * .build()))
     * // the properties below are optional
     * .asyncInferenceConfig(AsyncInferenceConfigProperty.builder()
     * .outputConfig(AsyncInferenceOutputConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
     * .errorTopic("errorTopic")
     * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
     * .successTopic("successTopic")
     * .build())
     * .s3FailurePath("s3FailurePath")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * // the properties below are optional
     * .clientConfig(AsyncInferenceClientConfigProperty.builder()
     * .maxConcurrentInvocationsPerInstance(123)
     * .build())
     * .build())
     * .dataCaptureConfig(DataCaptureConfigProperty.builder()
     * .captureOptions(List.of(CaptureOptionProperty.builder()
     * .captureMode("captureMode")
     * .build()))
     * .destinationS3Uri("destinationS3Uri")
     * .initialSamplingPercentage(123)
     * // the properties below are optional
     * .captureContentTypeHeader(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .enableCapture(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .enableNetworkIsolation(false)
     * .endpointConfigName("endpointConfigName")
     * .executionRoleArn("executionRoleArn")
     * .explainerConfig(ExplainerConfigProperty.builder()
     * .clarifyExplainerConfig(ClarifyExplainerConfigProperty.builder()
     * .shapConfig(ClarifyShapConfigProperty.builder()
     * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build())
     * // the properties below are optional
     * .numberOfSamples(123)
     * .seed(123)
     * .textConfig(ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build())
     * .useLogit(false)
     * .build())
     * // the properties below are optional
     * .enableExplanations("enableExplanations")
     * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
     * .contentTemplate("contentTemplate")
     * .featureHeaders(List.of("featureHeaders"))
     * .featuresAttribute("featuresAttribute")
     * .featureTypes(List.of("featureTypes"))
     * .labelAttribute("labelAttribute")
     * .labelHeaders(List.of("labelHeaders"))
     * .labelIndex(123)
     * .maxPayloadInMb(123)
     * .maxRecordCount(123)
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityIndex(123)
     * .build())
     * .build())
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .shadowProductionVariants(List.of(ProductionVariantProperty.builder()
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType("acceleratorType")
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .enableSsmAccess(false)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .instanceType("instanceType")
     * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build())
     * .modelDataDownloadTimeoutInSeconds(123)
     * .modelName("modelName")
     * .routingConfig(RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build())
     * .serverlessConfig(ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build())
     * .volumeSizeInGb(123)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     */
    public inline fun cfnEndpointConfig(
        scope: Construct,
        id: String,
        block: CfnEndpointConfigDsl.() -> Unit = {},
    ): CfnEndpointConfig {
        val builder = CfnEndpointConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the behavior of the client used by SageMaker to interact with the model container
     * during asynchronous inference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AsyncInferenceClientConfigProperty asyncInferenceClientConfigProperty =
     * AsyncInferenceClientConfigProperty.builder()
     * .maxConcurrentInvocationsPerInstance(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceclientconfig.html)
     */
    public inline fun cfnEndpointConfigAsyncInferenceClientConfigProperty(
        block: CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.AsyncInferenceClientConfigProperty {
        val builder = CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AsyncInferenceConfigProperty asyncInferenceConfigProperty =
     * AsyncInferenceConfigProperty.builder()
     * .outputConfig(AsyncInferenceOutputConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
     * .errorTopic("errorTopic")
     * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
     * .successTopic("successTopic")
     * .build())
     * .s3FailurePath("s3FailurePath")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * // the properties below are optional
     * .clientConfig(AsyncInferenceClientConfigProperty.builder()
     * .maxConcurrentInvocationsPerInstance(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceconfig.html)
     */
    public inline fun cfnEndpointConfigAsyncInferenceConfigProperty(
        block: CfnEndpointConfigAsyncInferenceConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.AsyncInferenceConfigProperty {
        val builder = CfnEndpointConfigAsyncInferenceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration for notifications of inference results for asynchronous
     * inference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AsyncInferenceNotificationConfigProperty asyncInferenceNotificationConfigProperty =
     * AsyncInferenceNotificationConfigProperty.builder()
     * .errorTopic("errorTopic")
     * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
     * .successTopic("successTopic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html)
     */
    public inline fun cfnEndpointConfigAsyncInferenceNotificationConfigProperty(
        block: CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.AsyncInferenceNotificationConfigProperty {
        val builder = CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration for asynchronous inference invocation outputs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AsyncInferenceOutputConfigProperty asyncInferenceOutputConfigProperty =
     * AsyncInferenceOutputConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
     * .errorTopic("errorTopic")
     * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
     * .successTopic("successTopic")
     * .build())
     * .s3FailurePath("s3FailurePath")
     * .s3OutputPath("s3OutputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferenceoutputconfig.html)
     */
    public inline fun cfnEndpointConfigAsyncInferenceOutputConfigProperty(
        block: CfnEndpointConfigAsyncInferenceOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.AsyncInferenceOutputConfigProperty {
        val builder = CfnEndpointConfigAsyncInferenceOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the JSON and CSV content types of the data that the endpoint captures.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CaptureContentTypeHeaderProperty captureContentTypeHeaderProperty =
     * CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html)
     */
    public inline fun cfnEndpointConfigCaptureContentTypeHeaderProperty(
        block: CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.CaptureContentTypeHeaderProperty {
        val builder = CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether the endpoint captures input data or output data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CaptureOptionProperty captureOptionProperty = CaptureOptionProperty.builder()
     * .captureMode("captureMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-captureoption.html)
     */
    public inline fun cfnEndpointConfigCaptureOptionProperty(
        block: CfnEndpointConfigCaptureOptionPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.CaptureOptionProperty {
        val builder = CfnEndpointConfigCaptureOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration parameters for the SageMaker Clarify explainer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClarifyExplainerConfigProperty clarifyExplainerConfigProperty =
     * ClarifyExplainerConfigProperty.builder()
     * .shapConfig(ClarifyShapConfigProperty.builder()
     * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build())
     * // the properties below are optional
     * .numberOfSamples(123)
     * .seed(123)
     * .textConfig(ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build())
     * .useLogit(false)
     * .build())
     * // the properties below are optional
     * .enableExplanations("enableExplanations")
     * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
     * .contentTemplate("contentTemplate")
     * .featureHeaders(List.of("featureHeaders"))
     * .featuresAttribute("featuresAttribute")
     * .featureTypes(List.of("featureTypes"))
     * .labelAttribute("labelAttribute")
     * .labelHeaders(List.of("labelHeaders"))
     * .labelIndex(123)
     * .maxPayloadInMb(123)
     * .maxRecordCount(123)
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityIndex(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyexplainerconfig.html)
     */
    public inline fun cfnEndpointConfigClarifyExplainerConfigProperty(
        block: CfnEndpointConfigClarifyExplainerConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ClarifyExplainerConfigProperty {
        val builder = CfnEndpointConfigClarifyExplainerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The inference configuration parameter for the model container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClarifyInferenceConfigProperty clarifyInferenceConfigProperty =
     * ClarifyInferenceConfigProperty.builder()
     * .contentTemplate("contentTemplate")
     * .featureHeaders(List.of("featureHeaders"))
     * .featuresAttribute("featuresAttribute")
     * .featureTypes(List.of("featureTypes"))
     * .labelAttribute("labelAttribute")
     * .labelHeaders(List.of("labelHeaders"))
     * .labelIndex(123)
     * .maxPayloadInMb(123)
     * .maxRecordCount(123)
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityIndex(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html)
     */
    public inline fun cfnEndpointConfigClarifyInferenceConfigProperty(
        block: CfnEndpointConfigClarifyInferenceConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ClarifyInferenceConfigProperty {
        val builder = CfnEndpointConfigClarifyInferenceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the
     * [SHAP baseline](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-feature-attribute-shap-baselines.html)
     * (also called the background or reference dataset) of the Kernal SHAP algorithm.
     * * The number of records in the baseline data determines the size of the synthetic dataset,
     *   which has an impact on latency of explainability requests. For more information, see the
     *   *Synthetic data* of
     *   [Configure and create an endpoint](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html)
     *   .
     * * `ShapBaseline` and `ShapBaselineUri` are mutually exclusive parameters. One or the either
     *   is required to configure a SHAP baseline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClarifyShapBaselineConfigProperty clarifyShapBaselineConfigProperty =
     * ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapbaselineconfig.html)
     */
    public inline fun cfnEndpointConfigClarifyShapBaselineConfigProperty(
        block: CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ClarifyShapBaselineConfigProperty {
        val builder = CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for SHAP analysis using SageMaker Clarify Explainer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClarifyShapConfigProperty clarifyShapConfigProperty = ClarifyShapConfigProperty.builder()
     * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build())
     * // the properties below are optional
     * .numberOfSamples(123)
     * .seed(123)
     * .textConfig(ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build())
     * .useLogit(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyshapconfig.html)
     */
    public inline fun cfnEndpointConfigClarifyShapConfigProperty(
        block: CfnEndpointConfigClarifyShapConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ClarifyShapConfigProperty {
        val builder = CfnEndpointConfigClarifyShapConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A parameter used to configure the SageMaker Clarify explainer to treat text features as text
     * so that explanations are provided for individual units of text.
     *
     * Required only for natural language processing (NLP) explainability.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClarifyTextConfigProperty clarifyTextConfigProperty = ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html)
     */
    public inline fun cfnEndpointConfigClarifyTextConfigProperty(
        block: CfnEndpointConfigClarifyTextConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ClarifyTextConfigProperty {
        val builder = CfnEndpointConfigClarifyTextConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of your endpoint for model monitor data capture.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataCaptureConfigProperty dataCaptureConfigProperty = DataCaptureConfigProperty.builder()
     * .captureOptions(List.of(CaptureOptionProperty.builder()
     * .captureMode("captureMode")
     * .build()))
     * .destinationS3Uri("destinationS3Uri")
     * .initialSamplingPercentage(123)
     * // the properties below are optional
     * .captureContentTypeHeader(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .enableCapture(false)
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html)
     */
    public inline fun cfnEndpointConfigDataCaptureConfigProperty(
        block: CfnEndpointConfigDataCaptureConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.DataCaptureConfigProperty {
        val builder = CfnEndpointConfigDataCaptureConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A parameter to activate explainers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ExplainerConfigProperty explainerConfigProperty = ExplainerConfigProperty.builder()
     * .clarifyExplainerConfig(ClarifyExplainerConfigProperty.builder()
     * .shapConfig(ClarifyShapConfigProperty.builder()
     * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build())
     * // the properties below are optional
     * .numberOfSamples(123)
     * .seed(123)
     * .textConfig(ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build())
     * .useLogit(false)
     * .build())
     * // the properties below are optional
     * .enableExplanations("enableExplanations")
     * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
     * .contentTemplate("contentTemplate")
     * .featureHeaders(List.of("featureHeaders"))
     * .featuresAttribute("featuresAttribute")
     * .featureTypes(List.of("featureTypes"))
     * .labelAttribute("labelAttribute")
     * .labelHeaders(List.of("labelHeaders"))
     * .labelIndex(123)
     * .maxPayloadInMb(123)
     * .maxRecordCount(123)
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityIndex(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-explainerconfig.html)
     */
    public inline fun cfnEndpointConfigExplainerConfigProperty(
        block: CfnEndpointConfigExplainerConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ExplainerConfigProperty {
        val builder = CfnEndpointConfigExplainerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ManagedInstanceScalingProperty managedInstanceScalingProperty =
     * ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-managedinstancescaling.html)
     */
    public inline fun cfnEndpointConfigManagedInstanceScalingProperty(
        block: CfnEndpointConfigManagedInstanceScalingPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ManagedInstanceScalingProperty {
        val builder = CfnEndpointConfigManagedInstanceScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a model that you want to host and the resources to deploy for hosting it.
     *
     * If you are deploying multiple models, tell Amazon SageMaker how to distribute traffic among
     * the models by specifying the `InitialVariantWeight` objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ProductionVariantProperty productionVariantProperty = ProductionVariantProperty.builder()
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType("acceleratorType")
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .enableSsmAccess(false)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .instanceType("instanceType")
     * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build())
     * .modelDataDownloadTimeoutInSeconds(123)
     * .modelName("modelName")
     * .routingConfig(RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build())
     * .serverlessConfig(ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build())
     * .volumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html)
     */
    public inline fun cfnEndpointConfigProductionVariantProperty(
        block: CfnEndpointConfigProductionVariantPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ProductionVariantProperty {
        val builder = CfnEndpointConfigProductionVariantPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEndpointConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnEndpointConfigProps cfnEndpointConfigProps = CfnEndpointConfigProps.builder()
     * .productionVariants(List.of(ProductionVariantProperty.builder()
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType("acceleratorType")
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .enableSsmAccess(false)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .instanceType("instanceType")
     * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build())
     * .modelDataDownloadTimeoutInSeconds(123)
     * .modelName("modelName")
     * .routingConfig(RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build())
     * .serverlessConfig(ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build())
     * .volumeSizeInGb(123)
     * .build()))
     * // the properties below are optional
     * .asyncInferenceConfig(AsyncInferenceConfigProperty.builder()
     * .outputConfig(AsyncInferenceOutputConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .notificationConfig(AsyncInferenceNotificationConfigProperty.builder()
     * .errorTopic("errorTopic")
     * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
     * .successTopic("successTopic")
     * .build())
     * .s3FailurePath("s3FailurePath")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * // the properties below are optional
     * .clientConfig(AsyncInferenceClientConfigProperty.builder()
     * .maxConcurrentInvocationsPerInstance(123)
     * .build())
     * .build())
     * .dataCaptureConfig(DataCaptureConfigProperty.builder()
     * .captureOptions(List.of(CaptureOptionProperty.builder()
     * .captureMode("captureMode")
     * .build()))
     * .destinationS3Uri("destinationS3Uri")
     * .initialSamplingPercentage(123)
     * // the properties below are optional
     * .captureContentTypeHeader(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .enableCapture(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .enableNetworkIsolation(false)
     * .endpointConfigName("endpointConfigName")
     * .executionRoleArn("executionRoleArn")
     * .explainerConfig(ExplainerConfigProperty.builder()
     * .clarifyExplainerConfig(ClarifyExplainerConfigProperty.builder()
     * .shapConfig(ClarifyShapConfigProperty.builder()
     * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
     * .mimeType("mimeType")
     * .shapBaseline("shapBaseline")
     * .shapBaselineUri("shapBaselineUri")
     * .build())
     * // the properties below are optional
     * .numberOfSamples(123)
     * .seed(123)
     * .textConfig(ClarifyTextConfigProperty.builder()
     * .granularity("granularity")
     * .language("language")
     * .build())
     * .useLogit(false)
     * .build())
     * // the properties below are optional
     * .enableExplanations("enableExplanations")
     * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
     * .contentTemplate("contentTemplate")
     * .featureHeaders(List.of("featureHeaders"))
     * .featuresAttribute("featuresAttribute")
     * .featureTypes(List.of("featureTypes"))
     * .labelAttribute("labelAttribute")
     * .labelHeaders(List.of("labelHeaders"))
     * .labelIndex(123)
     * .maxPayloadInMb(123)
     * .maxRecordCount(123)
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityIndex(123)
     * .build())
     * .build())
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .shadowProductionVariants(List.of(ProductionVariantProperty.builder()
     * .variantName("variantName")
     * // the properties below are optional
     * .acceleratorType("acceleratorType")
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .enableSsmAccess(false)
     * .initialInstanceCount(123)
     * .initialVariantWeight(123)
     * .instanceType("instanceType")
     * .managedInstanceScaling(ManagedInstanceScalingProperty.builder()
     * .maxInstanceCount(123)
     * .minInstanceCount(123)
     * .status("status")
     * .build())
     * .modelDataDownloadTimeoutInSeconds(123)
     * .modelName("modelName")
     * .routingConfig(RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build())
     * .serverlessConfig(ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build())
     * .volumeSizeInGb(123)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
     */
    public inline fun cfnEndpointConfigProps(
        block: CfnEndpointConfigPropsDsl.() -> Unit = {}
    ): CfnEndpointConfigProps {
        val builder = CfnEndpointConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
     * .routingStrategy("routingStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-routingconfig.html)
     */
    public inline fun cfnEndpointConfigRoutingConfigProperty(
        block: CfnEndpointConfigRoutingConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.RoutingConfigProperty {
        val builder = CfnEndpointConfigRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the serverless configuration for an endpoint variant.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ServerlessConfigProperty serverlessConfigProperty = ServerlessConfigProperty.builder()
     * .maxConcurrency(123)
     * .memorySizeInMb(123)
     * // the properties below are optional
     * .provisionedConcurrency(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-serverlessconfig.html)
     */
    public inline fun cfnEndpointConfigServerlessConfigProperty(
        block: CfnEndpointConfigServerlessConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.ServerlessConfigProperty {
        val builder = CfnEndpointConfigServerlessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-vpcconfig.html)
     */
    public inline fun cfnEndpointConfigVpcConfigProperty(
        block: CfnEndpointConfigVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpointConfig.VpcConfigProperty {
        val builder = CfnEndpointConfigVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DeploymentConfigProperty deploymentConfigProperty = DeploymentConfigProperty.builder()
     * .autoRollbackConfiguration(AutoRollbackConfigProperty.builder()
     * .alarms(List.of(AlarmProperty.builder()
     * .alarmName("alarmName")
     * .build()))
     * .build())
     * .blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty.builder()
     * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .canarySize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .linearStepSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * .build())
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .terminationWaitInSeconds(123)
     * .build())
     * .rollingUpdatePolicy(RollingUpdatePolicyProperty.builder()
     * .maximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-deploymentconfig.html)
     */
    public inline fun cfnEndpointDeploymentConfigProperty(
        block: CfnEndpointDeploymentConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.DeploymentConfigProperty {
        val builder = CfnEndpointDeploymentConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
     * .endpointConfigName("endpointConfigName")
     * // the properties below are optional
     * .deploymentConfig(DeploymentConfigProperty.builder()
     * .autoRollbackConfiguration(AutoRollbackConfigProperty.builder()
     * .alarms(List.of(AlarmProperty.builder()
     * .alarmName("alarmName")
     * .build()))
     * .build())
     * .blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty.builder()
     * .trafficRoutingConfiguration(TrafficRoutingConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .canarySize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .linearStepSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * .build())
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .terminationWaitInSeconds(123)
     * .build())
     * .rollingUpdatePolicy(RollingUpdatePolicyProperty.builder()
     * .maximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .build())
     * .build())
     * .endpointName("endpointName")
     * .excludeRetainedVariantProperties(List.of(VariantPropertyProperty.builder()
     * .variantPropertyType("variantPropertyType")
     * .build()))
     * .retainAllVariantProperties(false)
     * .retainDeploymentConfig(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html)
     */
    public inline fun cfnEndpointProps(
        block: CfnEndpointPropsDsl.() -> Unit = {}
    ): CfnEndpointProps {
        val builder = CfnEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RollingUpdatePolicyProperty rollingUpdatePolicyProperty = RollingUpdatePolicyProperty.builder()
     * .maximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * // the properties below are optional
     * .maximumExecutionTimeoutInSeconds(123)
     * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html)
     */
    public inline fun cfnEndpointRollingUpdatePolicyProperty(
        block: CfnEndpointRollingUpdatePolicyPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.RollingUpdatePolicyProperty {
        val builder = CfnEndpointRollingUpdatePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the traffic routing strategy during an endpoint deployment to shift traffic from the
     * old fleet to the new fleet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrafficRoutingConfigProperty trafficRoutingConfigProperty =
     * TrafficRoutingConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .canarySize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .linearStepSize(CapacitySizeProperty.builder()
     * .type("type")
     * .value(123)
     * .build())
     * .waitIntervalInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-trafficroutingconfig.html)
     */
    public inline fun cfnEndpointTrafficRoutingConfigProperty(
        block: CfnEndpointTrafficRoutingConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.TrafficRoutingConfigProperty {
        val builder = CfnEndpointTrafficRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a production variant property type for an Endpoint.
     *
     * If you are updating an Endpoint with the
     * [RetainAllVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties)
     * option set to `true` , the `VarientProperty` objects listed in
     * [ExcludeRetainedVariantProperties](https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-ExcludeRetainedVariantProperties)
     * override the existing variant properties of the Endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VariantPropertyProperty variantPropertyProperty = VariantPropertyProperty.builder()
     * .variantPropertyType("variantPropertyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-variantproperty.html)
     */
    public inline fun cfnEndpointVariantPropertyProperty(
        block: CfnEndpointVariantPropertyPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.VariantPropertyProperty {
        val builder = CfnEndpointVariantPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new `FeatureGroup` .
     *
     * A `FeatureGroup` is a group of `Features` defined in the `FeatureStore` to describe a
     * `Record` .
     *
     * The `FeatureGroup` defines the schema and features contained in the FeatureGroup. A
     * `FeatureGroup` definition is composed of a list of `Features` , a
     * `RecordIdentifierFeatureName` , an `EventTimeFeatureName` and configurations for its
     * `OnlineStore` and `OfflineStore` . Check
     * [AWS service quotas](https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html)
     * to see the `FeatureGroup` s quota for your AWS account.
     *
     * You must include at least one of `OnlineStoreConfig` and `OfflineStoreConfig` to create a
     * `FeatureGroup` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object offlineStoreConfig;
     * Object onlineStoreConfig;
     * CfnFeatureGroup cfnFeatureGroup = CfnFeatureGroup.Builder.create(this, "MyCfnFeatureGroup")
     * .eventTimeFeatureName("eventTimeFeatureName")
     * .featureDefinitions(List.of(FeatureDefinitionProperty.builder()
     * .featureName("featureName")
     * .featureType("featureType")
     * .build()))
     * .featureGroupName("featureGroupName")
     * .recordIdentifierFeatureName("recordIdentifierFeatureName")
     * // the properties below are optional
     * .description("description")
     * .offlineStoreConfig(offlineStoreConfig)
     * .onlineStoreConfig(onlineStoreConfig)
     * .roleArn("roleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throughputConfig(ThroughputConfigProperty.builder()
     * .throughputMode("throughputMode")
     * // the properties below are optional
     * .provisionedReadCapacityUnits(123)
     * .provisionedWriteCapacityUnits(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html)
     */
    public inline fun cfnFeatureGroup(
        scope: Construct,
        id: String,
        block: CfnFeatureGroupDsl.() -> Unit = {},
    ): CfnFeatureGroup {
        val builder = CfnFeatureGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The meta data of the Glue table which serves as data catalog for the `OfflineStore` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataCatalogConfigProperty dataCatalogConfigProperty = DataCatalogConfigProperty.builder()
     * .catalog("catalog")
     * .database("database")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-datacatalogconfig.html)
     */
    public inline fun cfnFeatureGroupDataCatalogConfigProperty(
        block: CfnFeatureGroupDataCatalogConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.DataCatalogConfigProperty {
        val builder = CfnFeatureGroupDataCatalogConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of features.
     *
     * You must include `FeatureName` and `FeatureType` . Valid feature `FeatureType` s are
     * `Integral` , `Fractional` and `String` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * FeatureDefinitionProperty featureDefinitionProperty = FeatureDefinitionProperty.builder()
     * .featureName("featureName")
     * .featureType("featureType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-featuredefinition.html)
     */
    public inline fun cfnFeatureGroupFeatureDefinitionProperty(
        block: CfnFeatureGroupFeatureDefinitionPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.FeatureDefinitionProperty {
        val builder = CfnFeatureGroupFeatureDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of an `OfflineStore` .
     *
     * Provide an `OfflineStoreConfig` in a request to `CreateFeatureGroup` to create an
     * `OfflineStore` .
     *
     * To encrypt an `OfflineStore` using at rest data encryption, specify AWS Key Management
     * Service (KMS) key ID, or `KMSKeyId` , in `S3StorageConfig` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * OfflineStoreConfigProperty offlineStoreConfigProperty = OfflineStoreConfigProperty.builder()
     * .s3StorageConfig(S3StorageConfigProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * // the properties below are optional
     * .dataCatalogConfig(DataCatalogConfigProperty.builder()
     * .catalog("catalog")
     * .database("database")
     * .tableName("tableName")
     * .build())
     * .disableGlueTableCreation(false)
     * .tableFormat("tableFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-offlinestoreconfig.html)
     */
    public inline fun cfnFeatureGroupOfflineStoreConfigProperty(
        block: CfnFeatureGroupOfflineStoreConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.OfflineStoreConfigProperty {
        val builder = CfnFeatureGroupOfflineStoreConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this to specify the AWS Key Management Service (KMS) Key ID, or `KMSKeyId` , for at rest
     * data encryption.
     *
     * You can turn `OnlineStore` on or off by specifying the `EnableOnlineStore` flag at General
     * Assembly.
     *
     * The default value is `False` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * OnlineStoreConfigProperty onlineStoreConfigProperty = OnlineStoreConfigProperty.builder()
     * .enableOnlineStore(false)
     * .securityConfig(OnlineStoreSecurityConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .storageType("storageType")
     * .ttlDuration(TtlDurationProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html)
     */
    public inline fun cfnFeatureGroupOnlineStoreConfigProperty(
        block: CfnFeatureGroupOnlineStoreConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.OnlineStoreConfigProperty {
        val builder = CfnFeatureGroupOnlineStoreConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The security configuration for `OnlineStore` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * OnlineStoreSecurityConfigProperty onlineStoreSecurityConfigProperty =
     * OnlineStoreSecurityConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoresecurityconfig.html)
     */
    public inline fun cfnFeatureGroupOnlineStoreSecurityConfigProperty(
        block: CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.OnlineStoreSecurityConfigProperty {
        val builder = CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFeatureGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object offlineStoreConfig;
     * Object onlineStoreConfig;
     * CfnFeatureGroupProps cfnFeatureGroupProps = CfnFeatureGroupProps.builder()
     * .eventTimeFeatureName("eventTimeFeatureName")
     * .featureDefinitions(List.of(FeatureDefinitionProperty.builder()
     * .featureName("featureName")
     * .featureType("featureType")
     * .build()))
     * .featureGroupName("featureGroupName")
     * .recordIdentifierFeatureName("recordIdentifierFeatureName")
     * // the properties below are optional
     * .description("description")
     * .offlineStoreConfig(offlineStoreConfig)
     * .onlineStoreConfig(onlineStoreConfig)
     * .roleArn("roleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .throughputConfig(ThroughputConfigProperty.builder()
     * .throughputMode("throughputMode")
     * // the properties below are optional
     * .provisionedReadCapacityUnits(123)
     * .provisionedWriteCapacityUnits(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html)
     */
    public inline fun cfnFeatureGroupProps(
        block: CfnFeatureGroupPropsDsl.() -> Unit = {}
    ): CfnFeatureGroupProps {
        val builder = CfnFeatureGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Simple Storage (Amazon S3) location and and security configuration for
     * `OfflineStore` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3StorageConfigProperty s3StorageConfigProperty = S3StorageConfigProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html)
     */
    public inline fun cfnFeatureGroupS3StorageConfigProperty(
        block: CfnFeatureGroupS3StorageConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.S3StorageConfigProperty {
        val builder = CfnFeatureGroupS3StorageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to set feature group throughput configuration.
     *
     * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
     * data reads and writes that your application performs on your feature group. You do not need
     * to specify read and write throughput because Feature Store accommodates your workloads as
     * they ramp up and down. You can switch a feature group to on-demand only once in a 24 hour
     * period. With provisioned throughput mode, you specify the read and write capacity per second
     * that you expect your application to require, and you are billed based on those limits.
     * Exceeding provisioned throughput will result in your requests being throttled.
     *
     * Note: `PROVISIONED` throughput mode is supported only for feature groups that are
     * offline-only, or use the
     * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
     * tier online store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ThroughputConfigProperty throughputConfigProperty = ThroughputConfigProperty.builder()
     * .throughputMode("throughputMode")
     * // the properties below are optional
     * .provisionedReadCapacityUnits(123)
     * .provisionedWriteCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html)
     */
    public inline fun cfnFeatureGroupThroughputConfigProperty(
        block: CfnFeatureGroupThroughputConfigPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.ThroughputConfigProperty {
        val builder = CfnFeatureGroupThroughputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     *
     * `ExpiresAt` = `EventTime` + `TtlDuration` . For information on HardDelete, see the
     * [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
     * API in the Amazon SageMaker API Reference guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TtlDurationProperty ttlDurationProperty = TtlDurationProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-ttlduration.html)
     */
    public inline fun cfnFeatureGroupTtlDurationProperty(
        block: CfnFeatureGroupTtlDurationPropertyDsl.() -> Unit = {}
    ): CfnFeatureGroup.TtlDurationProperty {
        val builder = CfnFeatureGroupTtlDurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a custom SageMaker image.
     *
     * A SageMaker image is a set of image versions. Each image version represents a container image
     * stored in Amazon ECR. For more information, see
     * [Bring your own SageMaker image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnImage cfnImage = CfnImage.Builder.create(this, "MyCfnImage")
     * .imageName("imageName")
     * .imageRoleArn("imageRoleArn")
     * // the properties below are optional
     * .imageDescription("imageDescription")
     * .imageDisplayName("imageDisplayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html)
     */
    public inline fun cfnImage(
        scope: Construct,
        id: String,
        block: CfnImageDsl.() -> Unit = {},
    ): CfnImage {
        val builder = CfnImageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnImageProps cfnImageProps = CfnImageProps.builder()
     * .imageName("imageName")
     * .imageRoleArn("imageRoleArn")
     * // the properties below are optional
     * .imageDescription("imageDescription")
     * .imageDisplayName("imageDisplayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html)
     */
    public inline fun cfnImageProps(block: CfnImagePropsDsl.() -> Unit = {}): CfnImageProps {
        val builder = CfnImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a version of the SageMaker image specified by `ImageName` .
     *
     * The version represents the Amazon Container Registry (ECR) container image specified by
     * `BaseImage` .
     *
     * You can use the `DependsOn` attribute to specify that the creation of a specific resource
     * follows another. You can use it for the following use cases. For more information, see
     * [`DependsOn` attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     * * `DependsOn` can be used to establish a parent/child relationship between `ImageVersion` and
     *   `Image` where the `ImageVersion` `DependsOn` the `Image` .
     * * `DependsOn` can be used to establish order among `ImageVersion` s within the same `Image`
     *   namespace. For example, if ImageVersionB `DependsOn` ImageVersionA and both share the same
     *   parent `Image` , then ImageVersionA is version N and ImageVersionB is N+1.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnImageVersion cfnImageVersion = CfnImageVersion.Builder.create(this, "MyCfnImageVersion")
     * .baseImage("baseImage")
     * .imageName("imageName")
     * // the properties below are optional
     * .alias("alias")
     * .aliases(List.of("aliases"))
     * .horovod(false)
     * .jobType("jobType")
     * .mlFramework("mlFramework")
     * .processor("processor")
     * .programmingLang("programmingLang")
     * .releaseNotes("releaseNotes")
     * .vendorGuidance("vendorGuidance")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html)
     */
    public inline fun cfnImageVersion(
        scope: Construct,
        id: String,
        block: CfnImageVersionDsl.() -> Unit = {},
    ): CfnImageVersion {
        val builder = CfnImageVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImageVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnImageVersionProps cfnImageVersionProps = CfnImageVersionProps.builder()
     * .baseImage("baseImage")
     * .imageName("imageName")
     * // the properties below are optional
     * .alias("alias")
     * .aliases(List.of("aliases"))
     * .horovod(false)
     * .jobType("jobType")
     * .mlFramework("mlFramework")
     * .processor("processor")
     * .programmingLang("programmingLang")
     * .releaseNotes("releaseNotes")
     * .vendorGuidance("vendorGuidance")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html)
     */
    public inline fun cfnImageVersionProps(
        block: CfnImageVersionPropsDsl.() -> Unit = {}
    ): CfnImageVersionProps {
        val builder = CfnImageVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an inference component, which is a SageMaker hosting object that you can use to
     * deploy a model to an endpoint.
     *
     * In the inference component settings, you specify the model, the endpoint, and how the model
     * utilizes the resources that the endpoint hosts. You can optimize resource utilization by
     * tailoring how the required CPU cores, accelerators, and memory are allocated. You can deploy
     * multiple inference components to an endpoint, where each inference component contains one
     * model and the resource utilization needs for that individual model. After you deploy an
     * inference component, you can directly invoke the associated model when you use the
     * InvokeEndpoint API action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnInferenceComponent cfnInferenceComponent = CfnInferenceComponent.Builder.create(this,
     * "MyCfnInferenceComponent")
     * .endpointName("endpointName")
     * .runtimeConfig(InferenceComponentRuntimeConfigProperty.builder()
     * .copyCount(123)
     * .currentCopyCount(123)
     * .desiredCopyCount(123)
     * .build())
     * .specification(InferenceComponentSpecificationProperty.builder()
     * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
     * .maxMemoryRequiredInMb(123)
     * .minMemoryRequiredInMb(123)
     * .numberOfAcceleratorDevicesRequired(123)
     * .numberOfCpuCoresRequired(123)
     * .build())
     * // the properties below are optional
     * .container(InferenceComponentContainerSpecificationProperty.builder()
     * .artifactUrl("artifactUrl")
     * .deployedImage(DeployedImageProperty.builder()
     * .resolutionTime("resolutionTime")
     * .resolvedImage("resolvedImage")
     * .specifiedImage("specifiedImage")
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .image("image")
     * .build())
     * .modelName("modelName")
     * .startupParameters(InferenceComponentStartupParametersProperty.builder()
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .modelDataDownloadTimeoutInSeconds(123)
     * .build())
     * .build())
     * .variantName("variantName")
     * // the properties below are optional
     * .endpointArn("endpointArn")
     * .inferenceComponentName("inferenceComponentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html)
     */
    public inline fun cfnInferenceComponent(
        scope: Construct,
        id: String,
        block: CfnInferenceComponentDsl.() -> Unit = {},
    ): CfnInferenceComponent {
        val builder = CfnInferenceComponentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted
     * in this
     * [ProductionVariant](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ProductionVariant.html)
     * .
     *
     * If you used the `registry/repository[:tag]` form to specify the image path of the primary
     * container when you created the model hosted in this `ProductionVariant` , the path resolves
     * to a path of the form `registry/repository[&#64;digest]` . A digest is a hash value that
     * identifies a specific version of an image. For information about Amazon ECR paths, see
     * [Pulling an Image](https://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html)
     * in the *Amazon ECR User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DeployedImageProperty deployedImageProperty = DeployedImageProperty.builder()
     * .resolutionTime("resolutionTime")
     * .resolvedImage("resolvedImage")
     * .specifiedImage("specifiedImage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html)
     */
    public inline fun cfnInferenceComponentDeployedImageProperty(
        block: CfnInferenceComponentDeployedImagePropertyDsl.() -> Unit = {}
    ): CfnInferenceComponent.DeployedImageProperty {
        val builder = CfnInferenceComponentDeployedImagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the compute resources to allocate to run a model that you assign to an inference
     * component.
     *
     * These resources include CPU cores, accelerators, and memory.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceComponentComputeResourceRequirementsProperty
     * inferenceComponentComputeResourceRequirementsProperty =
     * InferenceComponentComputeResourceRequirementsProperty.builder()
     * .maxMemoryRequiredInMb(123)
     * .minMemoryRequiredInMb(123)
     * .numberOfAcceleratorDevicesRequired(123)
     * .numberOfCpuCoresRequired(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html)
     */
    public inline fun cfnInferenceComponentInferenceComponentComputeResourceRequirementsProperty(
        block:
            CfnInferenceComponentInferenceComponentComputeResourceRequirementsPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty {
        val builder =
            CfnInferenceComponentInferenceComponentComputeResourceRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a container that provides the runtime environment for a model that you deploy with an
     * inference component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceComponentContainerSpecificationProperty
     * inferenceComponentContainerSpecificationProperty =
     * InferenceComponentContainerSpecificationProperty.builder()
     * .artifactUrl("artifactUrl")
     * .deployedImage(DeployedImageProperty.builder()
     * .resolutionTime("resolutionTime")
     * .resolvedImage("resolvedImage")
     * .specifiedImage("specifiedImage")
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .image("image")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html)
     */
    public inline fun cfnInferenceComponentInferenceComponentContainerSpecificationProperty(
        block: CfnInferenceComponentInferenceComponentContainerSpecificationPropertyDsl.() -> Unit =
            {}
    ): CfnInferenceComponent.InferenceComponentContainerSpecificationProperty {
        val builder = CfnInferenceComponentInferenceComponentContainerSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Runtime settings for a model that is deployed with an inference component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceComponentRuntimeConfigProperty inferenceComponentRuntimeConfigProperty =
     * InferenceComponentRuntimeConfigProperty.builder()
     * .copyCount(123)
     * .currentCopyCount(123)
     * .desiredCopyCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html)
     */
    public inline fun cfnInferenceComponentInferenceComponentRuntimeConfigProperty(
        block: CfnInferenceComponentInferenceComponentRuntimeConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceComponent.InferenceComponentRuntimeConfigProperty {
        val builder = CfnInferenceComponentInferenceComponentRuntimeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the resources to deploy with this inference component, including the model,
     * container, and compute resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceComponentSpecificationProperty inferenceComponentSpecificationProperty =
     * InferenceComponentSpecificationProperty.builder()
     * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
     * .maxMemoryRequiredInMb(123)
     * .minMemoryRequiredInMb(123)
     * .numberOfAcceleratorDevicesRequired(123)
     * .numberOfCpuCoresRequired(123)
     * .build())
     * // the properties below are optional
     * .container(InferenceComponentContainerSpecificationProperty.builder()
     * .artifactUrl("artifactUrl")
     * .deployedImage(DeployedImageProperty.builder()
     * .resolutionTime("resolutionTime")
     * .resolvedImage("resolvedImage")
     * .specifiedImage("specifiedImage")
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .image("image")
     * .build())
     * .modelName("modelName")
     * .startupParameters(InferenceComponentStartupParametersProperty.builder()
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .modelDataDownloadTimeoutInSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html)
     */
    public inline fun cfnInferenceComponentInferenceComponentSpecificationProperty(
        block: CfnInferenceComponentInferenceComponentSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInferenceComponent.InferenceComponentSpecificationProperty {
        val builder = CfnInferenceComponentInferenceComponentSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that take effect while the model container starts up.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceComponentStartupParametersProperty inferenceComponentStartupParametersProperty =
     * InferenceComponentStartupParametersProperty.builder()
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .modelDataDownloadTimeoutInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html)
     */
    public inline fun cfnInferenceComponentInferenceComponentStartupParametersProperty(
        block: CfnInferenceComponentInferenceComponentStartupParametersPropertyDsl.() -> Unit = {}
    ): CfnInferenceComponent.InferenceComponentStartupParametersProperty {
        val builder = CfnInferenceComponentInferenceComponentStartupParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInferenceComponent`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnInferenceComponentProps cfnInferenceComponentProps = CfnInferenceComponentProps.builder()
     * .endpointName("endpointName")
     * .runtimeConfig(InferenceComponentRuntimeConfigProperty.builder()
     * .copyCount(123)
     * .currentCopyCount(123)
     * .desiredCopyCount(123)
     * .build())
     * .specification(InferenceComponentSpecificationProperty.builder()
     * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
     * .maxMemoryRequiredInMb(123)
     * .minMemoryRequiredInMb(123)
     * .numberOfAcceleratorDevicesRequired(123)
     * .numberOfCpuCoresRequired(123)
     * .build())
     * // the properties below are optional
     * .container(InferenceComponentContainerSpecificationProperty.builder()
     * .artifactUrl("artifactUrl")
     * .deployedImage(DeployedImageProperty.builder()
     * .resolutionTime("resolutionTime")
     * .resolvedImage("resolvedImage")
     * .specifiedImage("specifiedImage")
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .image("image")
     * .build())
     * .modelName("modelName")
     * .startupParameters(InferenceComponentStartupParametersProperty.builder()
     * .containerStartupHealthCheckTimeoutInSeconds(123)
     * .modelDataDownloadTimeoutInSeconds(123)
     * .build())
     * .build())
     * .variantName("variantName")
     * // the properties below are optional
     * .endpointArn("endpointArn")
     * .inferenceComponentName("inferenceComponentName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html)
     */
    public inline fun cfnInferenceComponentProps(
        block: CfnInferenceComponentPropsDsl.() -> Unit = {}
    ): CfnInferenceComponentProps {
        val builder = CfnInferenceComponentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an inference experiment using the configurations specified in the request.
     *
     * Use this API to setup and schedule an experiment to compare model variants on a Amazon
     * SageMaker inference endpoint. For more information about inference experiments, see
     * [Shadow tests](https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html) .
     *
     * Amazon SageMaker begins your experiment at the scheduled time and routes traffic to your
     * endpoint's model variants based on your specified configuration.
     *
     * While the experiment is in progress or after it has concluded, you can view metrics that
     * compare your model variants. For more information, see
     * [View, monitor, and edit shadow tests](https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests-view-monitor-edit.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnInferenceExperiment cfnInferenceExperiment = CfnInferenceExperiment.Builder.create(this,
     * "MyCfnInferenceExperiment")
     * .endpointName("endpointName")
     * .modelVariants(List.of(ModelVariantConfigProperty.builder()
     * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
     * .infrastructureType("infrastructureType")
     * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .build())
     * .build())
     * .modelName("modelName")
     * .variantName("variantName")
     * .build()))
     * .name("name")
     * .roleArn("roleArn")
     * .type("type")
     * // the properties below are optional
     * .dataStorageConfig(DataStorageConfigProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .contentType(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .kmsKey("kmsKey")
     * .build())
     * .description("description")
     * .desiredState("desiredState")
     * .kmsKey("kmsKey")
     * .schedule(InferenceExperimentScheduleProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build())
     * .shadowModeConfig(ShadowModeConfigProperty.builder()
     * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
     * .samplingPercentage(123)
     * .shadowModelVariantName("shadowModelVariantName")
     * .build()))
     * .sourceModelVariantName("sourceModelVariantName")
     * .build())
     * .statusReason("statusReason")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html)
     */
    public inline fun cfnInferenceExperiment(
        scope: Construct,
        id: String,
        block: CfnInferenceExperimentDsl.() -> Unit = {},
    ): CfnInferenceExperiment {
        val builder = CfnInferenceExperimentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration specifying how to treat different headers.
     *
     * If no headers are specified Amazon SageMaker will by default base64 encode when capturing the
     * data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CaptureContentTypeHeaderProperty captureContentTypeHeaderProperty =
     * CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-capturecontenttypeheader.html)
     */
    public inline fun cfnInferenceExperimentCaptureContentTypeHeaderProperty(
        block: CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.CaptureContentTypeHeaderProperty {
        val builder = CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 location and configuration for storing inference request and response data.
     *
     * This is an optional parameter that you can use for data capture. For more information, see
     * [Capture data](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataStorageConfigProperty dataStorageConfigProperty = DataStorageConfigProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .contentType(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .kmsKey("kmsKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html)
     */
    public inline fun cfnInferenceExperimentDataStorageConfigProperty(
        block: CfnInferenceExperimentDataStorageConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.DataStorageConfigProperty {
        val builder = CfnInferenceExperimentDataStorageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metadata of the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointMetadataProperty endpointMetadataProperty = EndpointMetadataProperty.builder()
     * .endpointName("endpointName")
     * // the properties below are optional
     * .endpointConfigName("endpointConfigName")
     * .endpointStatus("endpointStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html)
     */
    public inline fun cfnInferenceExperimentEndpointMetadataProperty(
        block: CfnInferenceExperimentEndpointMetadataPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.EndpointMetadataProperty {
        val builder = CfnInferenceExperimentEndpointMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The start and end times of an inference experiment.
     *
     * The maximum duration that you can set for an inference experiment is 30 days.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceExperimentScheduleProperty inferenceExperimentScheduleProperty =
     * InferenceExperimentScheduleProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html)
     */
    public inline fun cfnInferenceExperimentInferenceExperimentScheduleProperty(
        block: CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.InferenceExperimentScheduleProperty {
        val builder = CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the infrastructure that the model will be deployed to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelInfrastructureConfigProperty modelInfrastructureConfigProperty =
     * ModelInfrastructureConfigProperty.builder()
     * .infrastructureType("infrastructureType")
     * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelinfrastructureconfig.html)
     */
    public inline fun cfnInferenceExperimentModelInfrastructureConfigProperty(
        block: CfnInferenceExperimentModelInfrastructureConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.ModelInfrastructureConfigProperty {
        val builder = CfnInferenceExperimentModelInfrastructureConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the deployment options of a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelVariantConfigProperty modelVariantConfigProperty = ModelVariantConfigProperty.builder()
     * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
     * .infrastructureType("infrastructureType")
     * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .build())
     * .build())
     * .modelName("modelName")
     * .variantName("variantName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html)
     */
    public inline fun cfnInferenceExperimentModelVariantConfigProperty(
        block: CfnInferenceExperimentModelVariantConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.ModelVariantConfigProperty {
        val builder = CfnInferenceExperimentModelVariantConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInferenceExperiment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnInferenceExperimentProps cfnInferenceExperimentProps = CfnInferenceExperimentProps.builder()
     * .endpointName("endpointName")
     * .modelVariants(List.of(ModelVariantConfigProperty.builder()
     * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
     * .infrastructureType("infrastructureType")
     * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .build())
     * .build())
     * .modelName("modelName")
     * .variantName("variantName")
     * .build()))
     * .name("name")
     * .roleArn("roleArn")
     * .type("type")
     * // the properties below are optional
     * .dataStorageConfig(DataStorageConfigProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .contentType(CaptureContentTypeHeaderProperty.builder()
     * .csvContentTypes(List.of("csvContentTypes"))
     * .jsonContentTypes(List.of("jsonContentTypes"))
     * .build())
     * .kmsKey("kmsKey")
     * .build())
     * .description("description")
     * .desiredState("desiredState")
     * .kmsKey("kmsKey")
     * .schedule(InferenceExperimentScheduleProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build())
     * .shadowModeConfig(ShadowModeConfigProperty.builder()
     * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
     * .samplingPercentage(123)
     * .shadowModelVariantName("shadowModelVariantName")
     * .build()))
     * .sourceModelVariantName("sourceModelVariantName")
     * .build())
     * .statusReason("statusReason")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferenceexperiment.html)
     */
    public inline fun cfnInferenceExperimentProps(
        block: CfnInferenceExperimentPropsDsl.() -> Unit = {}
    ): CfnInferenceExperimentProps {
        val builder = CfnInferenceExperimentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The infrastructure configuration for deploying the model to a real-time inference endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RealTimeInferenceConfigProperty realTimeInferenceConfigProperty =
     * RealTimeInferenceConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-realtimeinferenceconfig.html)
     */
    public inline fun cfnInferenceExperimentRealTimeInferenceConfigProperty(
        block: CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.RealTimeInferenceConfigProperty {
        val builder = CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of `ShadowMode` inference experiment type, which specifies a production
     * variant to take all the inference requests, and a shadow variant to which Amazon SageMaker
     * replicates a percentage of the inference requests.
     *
     * For the shadow variant it also specifies the percentage of requests that Amazon SageMaker
     * replicates.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ShadowModeConfigProperty shadowModeConfigProperty = ShadowModeConfigProperty.builder()
     * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
     * .samplingPercentage(123)
     * .shadowModelVariantName("shadowModelVariantName")
     * .build()))
     * .sourceModelVariantName("sourceModelVariantName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html)
     */
    public inline fun cfnInferenceExperimentShadowModeConfigProperty(
        block: CfnInferenceExperimentShadowModeConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.ShadowModeConfigProperty {
        val builder = CfnInferenceExperimentShadowModeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name and sampling percentage of a shadow variant.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ShadowModelVariantConfigProperty shadowModelVariantConfigProperty =
     * ShadowModelVariantConfigProperty.builder()
     * .samplingPercentage(123)
     * .shadowModelVariantName("shadowModelVariantName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html)
     */
    public inline fun cfnInferenceExperimentShadowModelVariantConfigProperty(
        block: CfnInferenceExperimentShadowModelVariantConfigPropertyDsl.() -> Unit = {}
    ): CfnInferenceExperiment.ShadowModelVariantConfigProperty {
        val builder = CfnInferenceExperimentShadowModelVariantConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::Model` resource to create a model to host at an Amazon SageMaker
     * endpoint.
     *
     * For more information, see
     * [Deploying a Model on Amazon SageMaker Hosting Services](https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works-hosting.html)
     * in the *Amazon SageMaker Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object environment;
     * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
     * .containers(List.of(ContainerDefinitionProperty.builder()
     * .containerHostname("containerHostname")
     * .environment(environment)
     * .image("image")
     * .imageConfig(ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build())
     * .inferenceSpecificationName("inferenceSpecificationName")
     * .mode("mode")
     * .modelDataSource(ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build())
     * .modelDataUrl("modelDataUrl")
     * .modelPackageName("modelPackageName")
     * .multiModelConfig(MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build())
     * .build()))
     * .enableNetworkIsolation(false)
     * .executionRoleArn("executionRoleArn")
     * .inferenceExecutionConfig(InferenceExecutionConfigProperty.builder()
     * .mode("mode")
     * .build())
     * .modelName("modelName")
     * .primaryContainer(ContainerDefinitionProperty.builder()
     * .containerHostname("containerHostname")
     * .environment(environment)
     * .image("image")
     * .imageConfig(ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build())
     * .inferenceSpecificationName("inferenceSpecificationName")
     * .mode("mode")
     * .modelDataSource(ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build())
     * .modelDataUrl("modelDataUrl")
     * .modelPackageName("modelPackageName")
     * .multiModelConfig(MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
     */
    public inline fun cfnModel(
        scope: Construct,
        id: String,
        block: CfnModelDsl.() -> Unit = {},
    ): CfnModel {
        val builder = CfnModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates the definition for a model bias job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelBiasJobDefinition cfnModelBiasJobDefinition =
     * CfnModelBiasJobDefinition.Builder.create(this, "MyCfnModelBiasJobDefinition")
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelBiasAppSpecification(ModelBiasAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build())
     * .modelBiasJobInput(ModelBiasJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build())
     * .modelBiasJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelBiasBaselineConfig(ModelBiasBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html)
     */
    public inline fun cfnModelBiasJobDefinition(
        scope: Construct,
        id: String,
        block: CfnModelBiasJobDefinitionDsl.() -> Unit = {},
    ): CfnModelBiasJobDefinition {
        val builder = CfnModelBiasJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the batch transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html)
     */
    public inline fun cfnModelBiasJobDefinitionBatchTransformInputProperty(
        block: CfnModelBiasJobDefinitionBatchTransformInputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.BatchTransformInputProperty {
        val builder = CfnModelBiasJobDefinitionBatchTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-clusterconfig.html)
     */
    public inline fun cfnModelBiasJobDefinitionClusterConfigProperty(
        block: CfnModelBiasJobDefinitionClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.ClusterConfigProperty {
        val builder = CfnModelBiasJobDefinitionClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The constraints resource for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-constraintsresource.html)
     */
    public inline fun cfnModelBiasJobDefinitionConstraintsResourceProperty(
        block: CfnModelBiasJobDefinitionConstraintsResourcePropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.ConstraintsResourceProperty {
        val builder = CfnModelBiasJobDefinitionConstraintsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CSV format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .header(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-csv.html)
     */
    public inline fun cfnModelBiasJobDefinitionCsvProperty(
        block: CfnModelBiasJobDefinitionCsvPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.CsvProperty {
        val builder = CfnModelBiasJobDefinitionCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset format of the data to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-datasetformat.html)
     */
    public inline fun cfnModelBiasJobDefinitionDatasetFormatProperty(
        block: CfnModelBiasJobDefinitionDatasetFormatPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.DatasetFormatProperty {
        val builder = CfnModelBiasJobDefinitionDatasetFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-endpointinput.html)
     */
    public inline fun cfnModelBiasJobDefinitionEndpointInputProperty(
        block: CfnModelBiasJobDefinitionEndpointInputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.EndpointInputProperty {
        val builder = CfnModelBiasJobDefinitionEndpointInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Json format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JsonProperty jsonProperty = JsonProperty.builder()
     * .line(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-json.html)
     */
    public inline fun cfnModelBiasJobDefinitionJsonProperty(
        block: CfnModelBiasJobDefinitionJsonPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.JsonProperty {
        val builder = CfnModelBiasJobDefinitionJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Docker container image configuration object for the model bias job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelBiasAppSpecificationProperty modelBiasAppSpecificationProperty =
     * ModelBiasAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html)
     */
    public inline fun cfnModelBiasJobDefinitionModelBiasAppSpecificationProperty(
        block: CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty {
        val builder = CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a baseline model bias job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelBiasBaselineConfigProperty modelBiasBaselineConfigProperty =
     * ModelBiasBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html)
     */
    public inline fun cfnModelBiasJobDefinitionModelBiasBaselineConfigProperty(
        block: CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty {
        val builder = CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inputs for the model bias job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelBiasJobInputProperty modelBiasJobInputProperty = ModelBiasJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html)
     */
    public inline fun cfnModelBiasJobDefinitionModelBiasJobInputProperty(
        block: CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.ModelBiasJobInputProperty {
        val builder = CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ground truth labels for the dataset used for the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringGroundTruthS3InputProperty monitoringGroundTruthS3InputProperty =
     * MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input.html)
     */
    public inline fun cfnModelBiasJobDefinitionMonitoringGroundTruthS3InputProperty(
        block: CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty {
        val builder = CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
     * MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutputconfig.html)
     */
    public inline fun cfnModelBiasJobDefinitionMonitoringOutputConfigProperty(
        block: CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.MonitoringOutputConfigProperty {
        val builder = CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output object for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringoutput.html)
     */
    public inline fun cfnModelBiasJobDefinitionMonitoringOutputProperty(
        block: CfnModelBiasJobDefinitionMonitoringOutputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.MonitoringOutputProperty {
        val builder = CfnModelBiasJobDefinitionMonitoringOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringresources.html)
     */
    public inline fun cfnModelBiasJobDefinitionMonitoringResourcesProperty(
        block: CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.MonitoringResourcesProperty {
        val builder = CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Networking options for a job, such as network traffic encryption between containers, whether
     * to allow inbound and outbound network calls to and from containers, and the VPC subnets and
     * security groups to use for VPC-enabled jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-networkconfig.html)
     */
    public inline fun cfnModelBiasJobDefinitionNetworkConfigProperty(
        block: CfnModelBiasJobDefinitionNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.NetworkConfigProperty {
        val builder = CfnModelBiasJobDefinitionNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelBiasJobDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelBiasJobDefinitionProps cfnModelBiasJobDefinitionProps =
     * CfnModelBiasJobDefinitionProps.builder()
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelBiasAppSpecification(ModelBiasAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build())
     * .modelBiasJobInput(ModelBiasJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build())
     * .modelBiasJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelBiasBaselineConfig(ModelBiasBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelbiasjobdefinition.html)
     */
    public inline fun cfnModelBiasJobDefinitionProps(
        block: CfnModelBiasJobDefinitionPropsDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinitionProps {
        val builder = CfnModelBiasJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html)
     */
    public inline fun cfnModelBiasJobDefinitionS3OutputProperty(
        block: CfnModelBiasJobDefinitionS3OutputPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.S3OutputProperty {
        val builder = CfnModelBiasJobDefinitionS3OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job or model compilation job can run.
     *
     * It also specifies how long a managed spot training job has to complete. When the job reaches
     * the time limit, SageMaker ends the training or compilation job. Use this API to cap model
     * training costs.
     *
     * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
     * termination for 120 seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     *
     * The training algorithms provided by SageMaker automatically save the intermediate results of
     * a model training job when possible. This attempt to save artifacts is only a best effort case
     * as model might not be in a state from which it can be saved. For example, if training has
     * just started, the model might not be ready to save. When saved, this intermediate data is a
     * valid model artifact. You can use it to create a model with `CreateModel` .
     *
     * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
     * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
     * complete.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-stoppingcondition.html)
     */
    public inline fun cfnModelBiasJobDefinitionStoppingConditionProperty(
        block: CfnModelBiasJobDefinitionStoppingConditionPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.StoppingConditionProperty {
        val builder = CfnModelBiasJobDefinitionStoppingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-vpcconfig.html)
     */
    public inline fun cfnModelBiasJobDefinitionVpcConfigProperty(
        block: CfnModelBiasJobDefinitionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnModelBiasJobDefinition.VpcConfigProperty {
        val builder = CfnModelBiasJobDefinitionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon SageMaker Model Card.
     *
     * For information about how to use model cards, see
     * [Amazon SageMaker Model Card](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * CfnModelCard cfnModelCard = CfnModelCard.Builder.create(this, "MyCfnModelCard")
     * .content(ContentProperty.builder()
     * .additionalInformation(AdditionalInformationProperty.builder()
     * .caveatsAndRecommendations("caveatsAndRecommendations")
     * .customDetails(Map.of(
     * "customDetailsKey", "customDetails"))
     * .ethicalConsiderations("ethicalConsiderations")
     * .build())
     * .businessDetails(BusinessDetailsProperty.builder()
     * .businessProblem("businessProblem")
     * .businessStakeholders("businessStakeholders")
     * .lineOfBusiness("lineOfBusiness")
     * .build())
     * .evaluationDetails(List.of(EvaluationDetailProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .datasets(List.of("datasets"))
     * .evaluationJobArn("evaluationJobArn")
     * .evaluationObservation("evaluationObservation")
     * .metadata(Map.of(
     * "metadataKey", "metadata"))
     * .metricGroups(List.of(MetricGroupProperty.builder()
     * .metricData(List.of(MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build()))
     * .name("name")
     * .build()))
     * .build()))
     * .intendedUses(IntendedUsesProperty.builder()
     * .explanationsForRiskRating("explanationsForRiskRating")
     * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
     * .intendedUses("intendedUses")
     * .purposeOfModel("purposeOfModel")
     * .riskRating("riskRating")
     * .build())
     * .modelOverview(ModelOverviewProperty.builder()
     * .algorithmType("algorithmType")
     * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .modelArtifact(List.of("modelArtifact"))
     * .modelCreator("modelCreator")
     * .modelDescription("modelDescription")
     * .modelId("modelId")
     * .modelName("modelName")
     * .modelOwner("modelOwner")
     * .modelVersion(123)
     * .problemType("problemType")
     * .build())
     * .modelPackageDetails(ModelPackageDetailsProperty.builder()
     * .approvalDescription("approvalDescription")
     * .createdBy(ModelPackageCreatorProperty.builder()
     * .userProfileName("userProfileName")
     * .build())
     * .domain("domain")
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build()))
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelPackageArn("modelPackageArn")
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatus("modelPackageStatus")
     * .modelPackageVersion(123)
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .task("task")
     * .build())
     * .trainingDetails(TrainingDetailsProperty.builder()
     * .objectiveFunction(ObjectiveFunctionProperty.builder()
     * .function(FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build())
     * .notes("notes")
     * .build())
     * .trainingJobDetails(TrainingJobDetailsProperty.builder()
     * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .trainingArn("trainingArn")
     * .trainingDatasets(List.of("trainingDatasets"))
     * .trainingEnvironment(TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .trainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .build())
     * .trainingObservations("trainingObservations")
     * .build())
     * .build())
     * .modelCardName("modelCardName")
     * .modelCardStatus("modelCardStatus")
     * // the properties below are optional
     * .createdBy(UserContextProperty.builder()
     * .domainId("domainId")
     * .userProfileArn("userProfileArn")
     * .userProfileName("userProfileName")
     * .build())
     * .lastModifiedBy(UserContextProperty.builder()
     * .domainId("domainId")
     * .userProfileArn("userProfileArn")
     * .userProfileName("userProfileName")
     * .build())
     * .securityConfig(SecurityConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html)
     */
    public inline fun cfnModelCard(
        scope: Construct,
        id: String,
        block: CfnModelCardDsl.() -> Unit = {},
    ): CfnModelCard {
        val builder = CfnModelCardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional information about the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * AdditionalInformationProperty additionalInformationProperty =
     * AdditionalInformationProperty.builder()
     * .caveatsAndRecommendations("caveatsAndRecommendations")
     * .customDetails(Map.of(
     * "customDetailsKey", "customDetails"))
     * .ethicalConsiderations("ethicalConsiderations")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-additionalinformation.html)
     */
    public inline fun cfnModelCardAdditionalInformationProperty(
        block: CfnModelCardAdditionalInformationPropertyDsl.() -> Unit = {}
    ): CfnModelCard.AdditionalInformationProperty {
        val builder = CfnModelCardAdditionalInformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how the model supports business goals.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BusinessDetailsProperty businessDetailsProperty = BusinessDetailsProperty.builder()
     * .businessProblem("businessProblem")
     * .businessStakeholders("businessStakeholders")
     * .lineOfBusiness("lineOfBusiness")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html)
     */
    public inline fun cfnModelCardBusinessDetailsProperty(
        block: CfnModelCardBusinessDetailsPropertyDsl.() -> Unit = {}
    ): CfnModelCard.BusinessDetailsProperty {
        val builder = CfnModelCardBusinessDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ContainerProperty containerProperty = ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html)
     */
    public inline fun cfnModelCardContainerProperty(
        block: CfnModelCardContainerPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ContainerProperty {
        val builder = CfnModelCardContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The content of the model card.
     *
     * It follows the
     * [model card json schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * ContentProperty contentProperty = ContentProperty.builder()
     * .additionalInformation(AdditionalInformationProperty.builder()
     * .caveatsAndRecommendations("caveatsAndRecommendations")
     * .customDetails(Map.of(
     * "customDetailsKey", "customDetails"))
     * .ethicalConsiderations("ethicalConsiderations")
     * .build())
     * .businessDetails(BusinessDetailsProperty.builder()
     * .businessProblem("businessProblem")
     * .businessStakeholders("businessStakeholders")
     * .lineOfBusiness("lineOfBusiness")
     * .build())
     * .evaluationDetails(List.of(EvaluationDetailProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .datasets(List.of("datasets"))
     * .evaluationJobArn("evaluationJobArn")
     * .evaluationObservation("evaluationObservation")
     * .metadata(Map.of(
     * "metadataKey", "metadata"))
     * .metricGroups(List.of(MetricGroupProperty.builder()
     * .metricData(List.of(MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build()))
     * .name("name")
     * .build()))
     * .build()))
     * .intendedUses(IntendedUsesProperty.builder()
     * .explanationsForRiskRating("explanationsForRiskRating")
     * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
     * .intendedUses("intendedUses")
     * .purposeOfModel("purposeOfModel")
     * .riskRating("riskRating")
     * .build())
     * .modelOverview(ModelOverviewProperty.builder()
     * .algorithmType("algorithmType")
     * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .modelArtifact(List.of("modelArtifact"))
     * .modelCreator("modelCreator")
     * .modelDescription("modelDescription")
     * .modelId("modelId")
     * .modelName("modelName")
     * .modelOwner("modelOwner")
     * .modelVersion(123)
     * .problemType("problemType")
     * .build())
     * .modelPackageDetails(ModelPackageDetailsProperty.builder()
     * .approvalDescription("approvalDescription")
     * .createdBy(ModelPackageCreatorProperty.builder()
     * .userProfileName("userProfileName")
     * .build())
     * .domain("domain")
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build()))
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelPackageArn("modelPackageArn")
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatus("modelPackageStatus")
     * .modelPackageVersion(123)
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .task("task")
     * .build())
     * .trainingDetails(TrainingDetailsProperty.builder()
     * .objectiveFunction(ObjectiveFunctionProperty.builder()
     * .function(FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build())
     * .notes("notes")
     * .build())
     * .trainingJobDetails(TrainingJobDetailsProperty.builder()
     * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .trainingArn("trainingArn")
     * .trainingDatasets(List.of("trainingDatasets"))
     * .trainingEnvironment(TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .trainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .build())
     * .trainingObservations("trainingObservations")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-content.html)
     */
    public inline fun cfnModelCardContentProperty(
        block: CfnModelCardContentPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ContentProperty {
        val builder = CfnModelCardContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The evaluation details of the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * EvaluationDetailProperty evaluationDetailProperty = EvaluationDetailProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .datasets(List.of("datasets"))
     * .evaluationJobArn("evaluationJobArn")
     * .evaluationObservation("evaluationObservation")
     * .metadata(Map.of(
     * "metadataKey", "metadata"))
     * .metricGroups(List.of(MetricGroupProperty.builder()
     * .metricData(List.of(MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build()))
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-evaluationdetail.html)
     */
    public inline fun cfnModelCardEvaluationDetailProperty(
        block: CfnModelCardEvaluationDetailPropertyDsl.() -> Unit = {}
    ): CfnModelCard.EvaluationDetailProperty {
        val builder = CfnModelCardEvaluationDetailPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Function details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * FunctionProperty functionProperty = FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html)
     */
    public inline fun cfnModelCardFunctionProperty(
        block: CfnModelCardFunctionPropertyDsl.() -> Unit = {}
    ): CfnModelCard.FunctionProperty {
        val builder = CfnModelCardFunctionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An overview of a model's inference environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceEnvironmentProperty inferenceEnvironmentProperty =
     * InferenceEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferenceenvironment.html)
     */
    public inline fun cfnModelCardInferenceEnvironmentProperty(
        block: CfnModelCardInferenceEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnModelCard.InferenceEnvironmentProperty {
        val builder = CfnModelCardInferenceEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceSpecificationProperty inferenceSpecificationProperty =
     * InferenceSpecificationProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferencespecification.html)
     */
    public inline fun cfnModelCardInferenceSpecificationProperty(
        block: CfnModelCardInferenceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelCard.InferenceSpecificationProperty {
        val builder = CfnModelCardInferenceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The intended uses of a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * IntendedUsesProperty intendedUsesProperty = IntendedUsesProperty.builder()
     * .explanationsForRiskRating("explanationsForRiskRating")
     * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
     * .intendedUses("intendedUses")
     * .purposeOfModel("purposeOfModel")
     * .riskRating("riskRating")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-intendeduses.html)
     */
    public inline fun cfnModelCardIntendedUsesProperty(
        block: CfnModelCardIntendedUsesPropertyDsl.() -> Unit = {}
    ): CfnModelCard.IntendedUsesProperty {
        val builder = CfnModelCardIntendedUsesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metric data.
     *
     * The `type` determines the data types that you specify for `value` , `XAxisName` and
     * `YAxisName` . For information about specifying values for metrics, see
     * [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * MetricDataItemsProperty metricDataItemsProperty = MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html)
     */
    public inline fun cfnModelCardMetricDataItemsProperty(
        block: CfnModelCardMetricDataItemsPropertyDsl.() -> Unit = {}
    ): CfnModelCard.MetricDataItemsProperty {
        val builder = CfnModelCardMetricDataItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A group of metric data that you use to initialize a metric group object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * MetricGroupProperty metricGroupProperty = MetricGroupProperty.builder()
     * .metricData(List.of(MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build()))
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html)
     */
    public inline fun cfnModelCardMetricGroupProperty(
        block: CfnModelCardMetricGroupPropertyDsl.() -> Unit = {}
    ): CfnModelCard.MetricGroupProperty {
        val builder = CfnModelCardMetricGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An overview about the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelOverviewProperty modelOverviewProperty = ModelOverviewProperty.builder()
     * .algorithmType("algorithmType")
     * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .modelArtifact(List.of("modelArtifact"))
     * .modelCreator("modelCreator")
     * .modelDescription("modelDescription")
     * .modelId("modelId")
     * .modelName("modelName")
     * .modelOwner("modelOwner")
     * .modelVersion(123)
     * .problemType("problemType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html)
     */
    public inline fun cfnModelCardModelOverviewProperty(
        block: CfnModelCardModelOverviewPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ModelOverviewProperty {
        val builder = CfnModelCardModelOverviewPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelPackageCreatorProperty modelPackageCreatorProperty = ModelPackageCreatorProperty.builder()
     * .userProfileName("userProfileName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagecreator.html)
     */
    public inline fun cfnModelCardModelPackageCreatorProperty(
        block: CfnModelCardModelPackageCreatorPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ModelPackageCreatorProperty {
        val builder = CfnModelCardModelPackageCreatorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata information related to model package version.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelPackageDetailsProperty modelPackageDetailsProperty = ModelPackageDetailsProperty.builder()
     * .approvalDescription("approvalDescription")
     * .createdBy(ModelPackageCreatorProperty.builder()
     * .userProfileName("userProfileName")
     * .build())
     * .domain("domain")
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build()))
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelPackageArn("modelPackageArn")
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatus("modelPackageStatus")
     * .modelPackageVersion(123)
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .task("task")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html)
     */
    public inline fun cfnModelCardModelPackageDetailsProperty(
        block: CfnModelCardModelPackageDetailsPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ModelPackageDetailsProperty {
        val builder = CfnModelCardModelPackageDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The function that is optimized during model training.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ObjectiveFunctionProperty objectiveFunctionProperty = ObjectiveFunctionProperty.builder()
     * .function(FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build())
     * .notes("notes")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-objectivefunction.html)
     */
    public inline fun cfnModelCardObjectiveFunctionProperty(
        block: CfnModelCardObjectiveFunctionPropertyDsl.() -> Unit = {}
    ): CfnModelCard.ObjectiveFunctionProperty {
        val builder = CfnModelCardObjectiveFunctionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelCard`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object value;
     * CfnModelCardProps cfnModelCardProps = CfnModelCardProps.builder()
     * .content(ContentProperty.builder()
     * .additionalInformation(AdditionalInformationProperty.builder()
     * .caveatsAndRecommendations("caveatsAndRecommendations")
     * .customDetails(Map.of(
     * "customDetailsKey", "customDetails"))
     * .ethicalConsiderations("ethicalConsiderations")
     * .build())
     * .businessDetails(BusinessDetailsProperty.builder()
     * .businessProblem("businessProblem")
     * .businessStakeholders("businessStakeholders")
     * .lineOfBusiness("lineOfBusiness")
     * .build())
     * .evaluationDetails(List.of(EvaluationDetailProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .datasets(List.of("datasets"))
     * .evaluationJobArn("evaluationJobArn")
     * .evaluationObservation("evaluationObservation")
     * .metadata(Map.of(
     * "metadataKey", "metadata"))
     * .metricGroups(List.of(MetricGroupProperty.builder()
     * .metricData(List.of(MetricDataItemsProperty.builder()
     * .name("name")
     * .type("type")
     * .value(value)
     * // the properties below are optional
     * .notes("notes")
     * .xAxisName(List.of("xAxisName"))
     * .yAxisName(List.of("yAxisName"))
     * .build()))
     * .name("name")
     * .build()))
     * .build()))
     * .intendedUses(IntendedUsesProperty.builder()
     * .explanationsForRiskRating("explanationsForRiskRating")
     * .factorsAffectingModelEfficiency("factorsAffectingModelEfficiency")
     * .intendedUses("intendedUses")
     * .purposeOfModel("purposeOfModel")
     * .riskRating("riskRating")
     * .build())
     * .modelOverview(ModelOverviewProperty.builder()
     * .algorithmType("algorithmType")
     * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .modelArtifact(List.of("modelArtifact"))
     * .modelCreator("modelCreator")
     * .modelDescription("modelDescription")
     * .modelId("modelId")
     * .modelName("modelName")
     * .modelOwner("modelOwner")
     * .modelVersion(123)
     * .problemType("problemType")
     * .build())
     * .modelPackageDetails(ModelPackageDetailsProperty.builder()
     * .approvalDescription("approvalDescription")
     * .createdBy(ModelPackageCreatorProperty.builder()
     * .userProfileName("userProfileName")
     * .build())
     * .domain("domain")
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ContainerProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .nearestModelName("nearestModelName")
     * .build()))
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelPackageArn("modelPackageArn")
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatus("modelPackageStatus")
     * .modelPackageVersion(123)
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .task("task")
     * .build())
     * .trainingDetails(TrainingDetailsProperty.builder()
     * .objectiveFunction(ObjectiveFunctionProperty.builder()
     * .function(FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build())
     * .notes("notes")
     * .build())
     * .trainingJobDetails(TrainingJobDetailsProperty.builder()
     * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .trainingArn("trainingArn")
     * .trainingDatasets(List.of("trainingDatasets"))
     * .trainingEnvironment(TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .trainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .build())
     * .trainingObservations("trainingObservations")
     * .build())
     * .build())
     * .modelCardName("modelCardName")
     * .modelCardStatus("modelCardStatus")
     * // the properties below are optional
     * .createdBy(UserContextProperty.builder()
     * .domainId("domainId")
     * .userProfileArn("userProfileArn")
     * .userProfileName("userProfileName")
     * .build())
     * .lastModifiedBy(UserContextProperty.builder()
     * .domainId("domainId")
     * .userProfileArn("userProfileArn")
     * .userProfileName("userProfileName")
     * .build())
     * .securityConfig(SecurityConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html)
     */
    public inline fun cfnModelCardProps(
        block: CfnModelCardPropsDsl.() -> Unit = {}
    ): CfnModelCardProps {
        val builder = CfnModelCardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The security configuration used to protect model card data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SecurityConfigProperty securityConfigProperty = SecurityConfigProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-securityconfig.html)
     */
    public inline fun cfnModelCardSecurityConfigProperty(
        block: CfnModelCardSecurityConfigPropertyDsl.() -> Unit = {}
    ): CfnModelCard.SecurityConfigProperty {
        val builder = CfnModelCardSecurityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an algorithm that was used to create the model package.
     *
     * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm
     * in AWS Marketplace that you are subscribed to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SourceAlgorithmProperty sourceAlgorithmProperty = SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-sourcealgorithm.html)
     */
    public inline fun cfnModelCardSourceAlgorithmProperty(
        block: CfnModelCardSourceAlgorithmPropertyDsl.() -> Unit = {}
    ): CfnModelCard.SourceAlgorithmProperty {
        val builder = CfnModelCardSourceAlgorithmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The training details of the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrainingDetailsProperty trainingDetailsProperty = TrainingDetailsProperty.builder()
     * .objectiveFunction(ObjectiveFunctionProperty.builder()
     * .function(FunctionProperty.builder()
     * .condition("condition")
     * .facet("facet")
     * .function("function")
     * .build())
     * .notes("notes")
     * .build())
     * .trainingJobDetails(TrainingJobDetailsProperty.builder()
     * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .trainingArn("trainingArn")
     * .trainingDatasets(List.of("trainingDatasets"))
     * .trainingEnvironment(TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .trainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .build())
     * .trainingObservations("trainingObservations")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html)
     */
    public inline fun cfnModelCardTrainingDetailsProperty(
        block: CfnModelCardTrainingDetailsPropertyDsl.() -> Unit = {}
    ): CfnModelCard.TrainingDetailsProperty {
        val builder = CfnModelCardTrainingDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * SageMaker training image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrainingEnvironmentProperty trainingEnvironmentProperty = TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingenvironment.html)
     */
    public inline fun cfnModelCardTrainingEnvironmentProperty(
        block: CfnModelCardTrainingEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnModelCard.TrainingEnvironmentProperty {
        val builder = CfnModelCardTrainingEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A hyper parameter that was configured in training the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrainingHyperParameterProperty trainingHyperParameterProperty =
     * TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html)
     */
    public inline fun cfnModelCardTrainingHyperParameterProperty(
        block: CfnModelCardTrainingHyperParameterPropertyDsl.() -> Unit = {}
    ): CfnModelCard.TrainingHyperParameterProperty {
        val builder = CfnModelCardTrainingHyperParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The overview of a training job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrainingJobDetailsProperty trainingJobDetailsProperty = TrainingJobDetailsProperty.builder()
     * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .trainingArn("trainingArn")
     * .trainingDatasets(List.of("trainingDatasets"))
     * .trainingEnvironment(TrainingEnvironmentProperty.builder()
     * .containerImage(List.of("containerImage"))
     * .build())
     * .trainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html)
     */
    public inline fun cfnModelCardTrainingJobDetailsProperty(
        block: CfnModelCardTrainingJobDetailsPropertyDsl.() -> Unit = {}
    ): CfnModelCard.TrainingJobDetailsProperty {
        val builder = CfnModelCardTrainingJobDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A result from a SageMaker training job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TrainingMetricProperty trainingMetricProperty = TrainingMetricProperty.builder()
     * .name("name")
     * .value(123)
     * // the properties below are optional
     * .notes("notes")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingmetric.html)
     */
    public inline fun cfnModelCardTrainingMetricProperty(
        block: CfnModelCardTrainingMetricPropertyDsl.() -> Unit = {}
    ): CfnModelCard.TrainingMetricProperty {
        val builder = CfnModelCardTrainingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the user who created or modified an experiment, trial, trial component,
     * lineage group, project, or model card.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * UserContextProperty userContextProperty = UserContextProperty.builder()
     * .domainId("domainId")
     * .userProfileArn("userProfileArn")
     * .userProfileName("userProfileName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html)
     */
    public inline fun cfnModelCardUserContextProperty(
        block: CfnModelCardUserContextPropertyDsl.() -> Unit = {}
    ): CfnModelCard.UserContextProperty {
        val builder = CfnModelCardUserContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the container, as part of model definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object environment;
     * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
     * .containerHostname("containerHostname")
     * .environment(environment)
     * .image("image")
     * .imageConfig(ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build())
     * .inferenceSpecificationName("inferenceSpecificationName")
     * .mode("mode")
     * .modelDataSource(ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build())
     * .modelDataUrl("modelDataUrl")
     * .modelPackageName("modelPackageName")
     * .multiModelConfig(MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html)
     */
    public inline fun cfnModelContainerDefinitionProperty(
        block: CfnModelContainerDefinitionPropertyDsl.() -> Unit = {}
    ): CfnModel.ContainerDefinitionProperty {
        val builder = CfnModelContainerDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates the definition for a model explainability job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelExplainabilityJobDefinition cfnModelExplainabilityJobDefinition =
     * CfnModelExplainabilityJobDefinition.Builder.create(this, "MyCfnModelExplainabilityJobDefinition")
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build())
     * .modelExplainabilityJobInput(ModelExplainabilityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build())
     * .modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html)
     */
    public inline fun cfnModelExplainabilityJobDefinition(
        scope: Construct,
        id: String,
        block: CfnModelExplainabilityJobDefinitionDsl.() -> Unit = {},
    ): CfnModelExplainabilityJobDefinition {
        val builder = CfnModelExplainabilityJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the batch transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionBatchTransformInputProperty(
        block: CfnModelExplainabilityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.BatchTransformInputProperty {
        val builder = CfnModelExplainabilityJobDefinitionBatchTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the cluster resources used to run the processing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-clusterconfig.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionClusterConfigProperty(
        block: CfnModelExplainabilityJobDefinitionClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.ClusterConfigProperty {
        val builder = CfnModelExplainabilityJobDefinitionClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-constraintsresource.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionConstraintsResourceProperty(
        block: CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty {
        val builder = CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CSV format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .header(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-csv.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionCsvProperty(
        block: CfnModelExplainabilityJobDefinitionCsvPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.CsvProperty {
        val builder = CfnModelExplainabilityJobDefinitionCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset format of the data to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-datasetformat.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionDatasetFormatProperty(
        block: CfnModelExplainabilityJobDefinitionDatasetFormatPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.DatasetFormatProperty {
        val builder = CfnModelExplainabilityJobDefinitionDatasetFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-endpointinput.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionEndpointInputProperty(
        block: CfnModelExplainabilityJobDefinitionEndpointInputPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.EndpointInputProperty {
        val builder = CfnModelExplainabilityJobDefinitionEndpointInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Json format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JsonProperty jsonProperty = JsonProperty.builder()
     * .line(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-json.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionJsonProperty(
        block: CfnModelExplainabilityJobDefinitionJsonPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.JsonProperty {
        val builder = CfnModelExplainabilityJobDefinitionJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Docker container image configuration object for the model explainability job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelExplainabilityAppSpecificationProperty modelExplainabilityAppSpecificationProperty =
     * ModelExplainabilityAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityappspecification.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationProperty(
        block:
            CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty {
        val builder =
            CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a baseline model explainability job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelExplainabilityBaselineConfigProperty modelExplainabilityBaselineConfigProperty =
     * ModelExplainabilityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilitybaselineconfig.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigProperty(
        block:
            CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty {
        val builder =
            CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inputs for the model explainability job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelExplainabilityJobInputProperty modelExplainabilityJobInputProperty =
     * ModelExplainabilityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionModelExplainabilityJobInputProperty(
        block:
            CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl.() -> Unit =
            {}
    ): CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty {
        val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
     * MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutputconfig.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionMonitoringOutputConfigProperty(
        block: CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty {
        val builder = CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output object for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutput.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionMonitoringOutputProperty(
        block: CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.MonitoringOutputProperty {
        val builder = CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringresources.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionMonitoringResourcesProperty(
        block: CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty {
        val builder = CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Networking options for a job, such as network traffic encryption between containers, whether
     * to allow inbound and outbound network calls to and from containers, and the VPC subnets and
     * security groups to use for VPC-enabled jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-networkconfig.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionNetworkConfigProperty(
        block: CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.NetworkConfigProperty {
        val builder = CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelExplainabilityJobDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelExplainabilityJobDefinitionProps cfnModelExplainabilityJobDefinitionProps =
     * CfnModelExplainabilityJobDefinitionProps.builder()
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelExplainabilityAppSpecification(ModelExplainabilityAppSpecificationProperty.builder()
     * .configUri("configUri")
     * .imageUri("imageUri")
     * // the properties below are optional
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .build())
     * .modelExplainabilityJobInput(ModelExplainabilityJobInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .featuresAttribute("featuresAttribute")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build())
     * .modelExplainabilityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelexplainabilityjobdefinition.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionProps(
        block: CfnModelExplainabilityJobDefinitionPropsDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinitionProps {
        val builder = CfnModelExplainabilityJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-s3output.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionS3OutputProperty(
        block: CfnModelExplainabilityJobDefinitionS3OutputPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.S3OutputProperty {
        val builder = CfnModelExplainabilityJobDefinitionS3OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job or model compilation job can run.
     *
     * It also specifies how long a managed spot training job has to complete. When the job reaches
     * the time limit, SageMaker ends the training or compilation job. Use this API to cap model
     * training costs.
     *
     * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
     * termination for 120 seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     *
     * The training algorithms provided by SageMaker automatically save the intermediate results of
     * a model training job when possible. This attempt to save artifacts is only a best effort case
     * as model might not be in a state from which it can be saved. For example, if training has
     * just started, the model might not be ready to save. When saved, this intermediate data is a
     * valid model artifact. You can use it to create a model with `CreateModel` .
     *
     * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
     * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
     * complete.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-stoppingcondition.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionStoppingConditionProperty(
        block: CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.StoppingConditionProperty {
        val builder = CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-vpcconfig.html)
     */
    public inline fun cfnModelExplainabilityJobDefinitionVpcConfigProperty(
        block: CfnModelExplainabilityJobDefinitionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnModelExplainabilityJobDefinition.VpcConfigProperty {
        val builder = CfnModelExplainabilityJobDefinitionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry
     * accessible from your Amazon Virtual Private Cloud (VPC).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-imageconfig.html)
     */
    public inline fun cfnModelImageConfigProperty(
        block: CfnModelImageConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.ImageConfigProperty {
        val builder = CfnModelImageConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies details about how containers in a multi-container endpoint are run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InferenceExecutionConfigProperty inferenceExecutionConfigProperty =
     * InferenceExecutionConfigProperty.builder()
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-inferenceexecutionconfig.html)
     */
    public inline fun cfnModelInferenceExecutionConfigProperty(
        block: CfnModelInferenceExecutionConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.InferenceExecutionConfigProperty {
        val builder = CfnModelInferenceExecutionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The access configuration file to control access to the ML model.
     *
     * You can explicitly accept the model end-user license agreement (EULA) within the
     * `ModelAccessConfig` .
     * * If you are a Jumpstart user, see the
     *   [End-user license agreements](https://docs.aws.amazon.com/sagemaker/latest/dg/jumpstart-foundation-models-choose.html#jumpstart-foundation-models-choose-eula)
     *   section for more details on accepting the EULA.
     * * If you are an AutoML user, see the *Optional Parameters* section of *Create an AutoML job
     *   to fine-tune text generation models using the API* for details on
     *   [How to set the EULA acceptance when fine-tuning a model using the AutoML API](https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-create-experiment-finetune-llms.html#autopilot-llms-finetuning-api-optional-params)
     *   .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelAccessConfigProperty modelAccessConfigProperty = ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modelaccessconfig.html)
     */
    public inline fun cfnModelModelAccessConfigProperty(
        block: CfnModelModelAccessConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.ModelAccessConfigProperty {
        val builder = CfnModelModelAccessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the location of ML model data to deploy.
     *
     * If specified, you must specify one and only one of the available data sources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelDataSourceProperty modelDataSourceProperty = ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modeldatasource.html)
     */
    public inline fun cfnModelModelDataSourceProperty(
        block: CfnModelModelDataSourcePropertyDsl.() -> Unit = {}
    ): CfnModel.ModelDataSourceProperty {
        val builder = CfnModelModelDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies additional configuration for hosting multi-model endpoints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MultiModelConfigProperty multiModelConfigProperty = MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-multimodelconfig.html)
     */
    public inline fun cfnModelMultiModelConfigProperty(
        block: CfnModelMultiModelConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.MultiModelConfigProperty {
        val builder = CfnModelMultiModelConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A versioned model that can be deployed for SageMaker inference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelInput;
     * CfnModelPackage cfnModelPackage = CfnModelPackage.Builder.create(this, "MyCfnModelPackage")
     * .additionalInferenceSpecifications(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build()))
     * .additionalInferenceSpecificationsToAdd(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build()))
     * .approvalDescription("approvalDescription")
     * .certifyForMarketplace(false)
     * .clientToken("clientToken")
     * .customerMetadataProperties(Map.of(
     * "customerMetadataPropertiesKey", "customerMetadataProperties"))
     * .domain("domain")
     * .driftCheckBaselines(DriftCheckBaselinesProperty.builder()
     * .bias(DriftCheckBiasProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .postTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(DriftCheckExplainabilityProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(DriftCheckModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(DriftCheckModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build())
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * // the properties below are optional
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build())
     * .lastModifiedTime("lastModifiedTime")
     * .metadataProperties(MetadataPropertiesProperty.builder()
     * .commitId("commitId")
     * .generatedBy("generatedBy")
     * .projectId("projectId")
     * .repository("repository")
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelMetrics(ModelMetricsProperty.builder()
     * .bias(BiasProperty.builder()
     * .postTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(ExplainabilityProperty.builder()
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(ModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(ModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build())
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatusDetails(ModelPackageStatusDetailsProperty.builder()
     * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .failureReason("failureReason")
     * .build()))
     * .build())
     * .modelPackageVersion(123)
     * .samplePayloadUrl("samplePayloadUrl")
     * .skipModelValidation("skipModelValidation")
     * .sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty.builder()
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .task("task")
     * .validationSpecification(ValidationSpecificationProperty.builder()
     * .validationProfiles(List.of(ValidationProfileProperty.builder()
     * .profileName("profileName")
     * .transformJobDefinition(TransformJobDefinitionProperty.builder()
     * .transformInput(TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build())
     * .transformOutput(TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .transformResources(TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * // the properties below are optional
     * .batchStrategy("batchStrategy")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .maxConcurrentTransforms(123)
     * .maxPayloadInMb(123)
     * .build())
     * .build()))
     * .validationRole("validationRole")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html)
     */
    public inline fun cfnModelPackage(
        scope: Construct,
        id: String,
        block: CfnModelPackageDsl.() -> Unit = {},
    ): CfnModelPackage {
        val builder = CfnModelPackageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure of additional Inference Specification.
     *
     * Additional Inference Specification specifies details about inference jobs that can be run
     * with models based on this model package
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelInput;
     * AdditionalInferenceSpecificationDefinitionProperty
     * additionalInferenceSpecificationDefinitionProperty =
     * AdditionalInferenceSpecificationDefinitionProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html)
     */
    public inline fun cfnModelPackageAdditionalInferenceSpecificationDefinitionProperty(
        block: CfnModelPackageAdditionalInferenceSpecificationDefinitionPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty {
        val builder = CfnModelPackageAdditionalInferenceSpecificationDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains bias metrics for a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BiasProperty biasProperty = BiasProperty.builder()
     * .postTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-bias.html)
     */
    public inline fun cfnModelPackageBiasProperty(
        block: CfnModelPackageBiasPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.BiasProperty {
        val builder = CfnModelPackageBiasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the location of the channel data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-datasource.html)
     */
    public inline fun cfnModelPackageDataSourceProperty(
        block: CfnModelPackageDataSourcePropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DataSourceProperty {
        val builder = CfnModelPackageDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the drift check baselines that can be used when the model monitor is set using the
     * model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DriftCheckBaselinesProperty driftCheckBaselinesProperty = DriftCheckBaselinesProperty.builder()
     * .bias(DriftCheckBiasProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .postTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(DriftCheckExplainabilityProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(DriftCheckModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(DriftCheckModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbaselines.html)
     */
    public inline fun cfnModelPackageDriftCheckBaselinesProperty(
        block: CfnModelPackageDriftCheckBaselinesPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DriftCheckBaselinesProperty {
        val builder = CfnModelPackageDriftCheckBaselinesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the drift check bias baselines that can be used when the model monitor is set
     * using the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DriftCheckBiasProperty driftCheckBiasProperty = DriftCheckBiasProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .postTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckbias.html)
     */
    public inline fun cfnModelPackageDriftCheckBiasProperty(
        block: CfnModelPackageDriftCheckBiasPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DriftCheckBiasProperty {
        val builder = CfnModelPackageDriftCheckBiasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the drift check explainability baselines that can be used when the model monitor
     * is set using the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DriftCheckExplainabilityProperty driftCheckExplainabilityProperty =
     * DriftCheckExplainabilityProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckexplainability.html)
     */
    public inline fun cfnModelPackageDriftCheckExplainabilityProperty(
        block: CfnModelPackageDriftCheckExplainabilityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DriftCheckExplainabilityProperty {
        val builder = CfnModelPackageDriftCheckExplainabilityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the drift check data quality baselines that can be used when the model monitor is
     * set using the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DriftCheckModelDataQualityProperty driftCheckModelDataQualityProperty =
     * DriftCheckModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodeldataquality.html)
     */
    public inline fun cfnModelPackageDriftCheckModelDataQualityProperty(
        block: CfnModelPackageDriftCheckModelDataQualityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DriftCheckModelDataQualityProperty {
        val builder = CfnModelPackageDriftCheckModelDataQualityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the drift check model quality baselines that can be used when the model monitor is
     * set using the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DriftCheckModelQualityProperty driftCheckModelQualityProperty =
     * DriftCheckModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-driftcheckmodelquality.html)
     */
    public inline fun cfnModelPackageDriftCheckModelQualityProperty(
        block: CfnModelPackageDriftCheckModelQualityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.DriftCheckModelQualityProperty {
        val builder = CfnModelPackageDriftCheckModelQualityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains explainability metrics for a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ExplainabilityProperty explainabilityProperty = ExplainabilityProperty.builder()
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-explainability.html)
     */
    public inline fun cfnModelPackageExplainabilityProperty(
        block: CfnModelPackageExplainabilityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ExplainabilityProperty {
        val builder = CfnModelPackageExplainabilityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains details regarding the file source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * FileSourceProperty fileSourceProperty = FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html)
     */
    public inline fun cfnModelPackageFileSourceProperty(
        block: CfnModelPackageFileSourcePropertyDsl.() -> Unit = {}
    ): CfnModelPackage.FileSourceProperty {
        val builder = CfnModelPackageFileSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A group of versioned models in the model registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelPackageGroupPolicy;
     * CfnModelPackageGroup cfnModelPackageGroup = CfnModelPackageGroup.Builder.create(this,
     * "MyCfnModelPackageGroup")
     * .modelPackageGroupName("modelPackageGroupName")
     * // the properties below are optional
     * .modelPackageGroupDescription("modelPackageGroupDescription")
     * .modelPackageGroupPolicy(modelPackageGroupPolicy)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html)
     */
    public inline fun cfnModelPackageGroup(
        scope: Construct,
        id: String,
        block: CfnModelPackageGroupDsl.() -> Unit = {},
    ): CfnModelPackageGroup {
        val builder = CfnModelPackageGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelPackageGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelPackageGroupPolicy;
     * CfnModelPackageGroupProps cfnModelPackageGroupProps = CfnModelPackageGroupProps.builder()
     * .modelPackageGroupName("modelPackageGroupName")
     * // the properties below are optional
     * .modelPackageGroupDescription("modelPackageGroupDescription")
     * .modelPackageGroupPolicy(modelPackageGroupPolicy)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html)
     */
    public inline fun cfnModelPackageGroupProps(
        block: CfnModelPackageGroupPropsDsl.() -> Unit = {}
    ): CfnModelPackageGroupProps {
        val builder = CfnModelPackageGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines how to perform inference generation after a training job is run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelInput;
     * InferenceSpecificationProperty inferenceSpecificationProperty =
     * InferenceSpecificationProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * // the properties below are optional
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-inferencespecification.html)
     */
    public inline fun cfnModelPackageInferenceSpecificationProperty(
        block: CfnModelPackageInferenceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.InferenceSpecificationProperty {
        val builder = CfnModelPackageInferenceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata properties of the tracking entity, trial, or trial component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MetadataPropertiesProperty metadataPropertiesProperty = MetadataPropertiesProperty.builder()
     * .commitId("commitId")
     * .generatedBy("generatedBy")
     * .projectId("projectId")
     * .repository("repository")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metadataproperties.html)
     */
    public inline fun cfnModelPackageMetadataPropertiesProperty(
        block: CfnModelPackageMetadataPropertiesPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.MetadataPropertiesProperty {
        val builder = CfnModelPackageMetadataPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the metrics source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MetricsSourceProperty metricsSourceProperty = MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html)
     */
    public inline fun cfnModelPackageMetricsSourceProperty(
        block: CfnModelPackageMetricsSourcePropertyDsl.() -> Unit = {}
    ): CfnModelPackage.MetricsSourceProperty {
        val builder = CfnModelPackageMetricsSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Data quality constraints and statistics for a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelDataQualityProperty modelDataQualityProperty = ModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modeldataquality.html)
     */
    public inline fun cfnModelPackageModelDataQualityProperty(
        block: CfnModelPackageModelDataQualityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelDataQualityProperty {
        val builder = CfnModelPackageModelDataQualityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelInputProperty modelInputProperty = ModelInputProperty.builder()
     * .dataInputConfig("dataInputConfig")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelinput.html)
     */
    public inline fun cfnModelPackageModelInputProperty(
        block: CfnModelPackageModelInputPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelInputProperty {
        val builder = CfnModelPackageModelInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains metrics captured from a model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelMetricsProperty modelMetricsProperty = ModelMetricsProperty.builder()
     * .bias(BiasProperty.builder()
     * .postTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(ExplainabilityProperty.builder()
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(ModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(ModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelmetrics.html)
     */
    public inline fun cfnModelPackageModelMetricsProperty(
        block: CfnModelPackageModelMetricsPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelMetricsProperty {
        val builder = CfnModelPackageModelMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the Docker container for the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelInput;
     * ModelPackageContainerDefinitionProperty modelPackageContainerDefinitionProperty =
     * ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagecontainerdefinition.html)
     */
    public inline fun cfnModelPackageModelPackageContainerDefinitionProperty(
        block: CfnModelPackageModelPackageContainerDefinitionPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelPackageContainerDefinitionProperty {
        val builder = CfnModelPackageModelPackageContainerDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the validation and image scan statuses of the model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelPackageStatusDetailsProperty modelPackageStatusDetailsProperty =
     * ModelPackageStatusDetailsProperty.builder()
     * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .failureReason("failureReason")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusdetails.html)
     */
    public inline fun cfnModelPackageModelPackageStatusDetailsProperty(
        block: CfnModelPackageModelPackageStatusDetailsPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelPackageStatusDetailsProperty {
        val builder = CfnModelPackageModelPackageStatusDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the overall status of a model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelPackageStatusItemProperty modelPackageStatusItemProperty =
     * ModelPackageStatusItemProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .failureReason("failureReason")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html)
     */
    public inline fun cfnModelPackageModelPackageStatusItemProperty(
        block: CfnModelPackageModelPackageStatusItemPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelPackageStatusItemProperty {
        val builder = CfnModelPackageModelPackageStatusItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Model quality statistics and constraints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelQualityProperty modelQualityProperty = ModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelquality.html)
     */
    public inline fun cfnModelPackageModelQualityProperty(
        block: CfnModelPackageModelQualityPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ModelQualityProperty {
        val builder = CfnModelPackageModelQualityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelPackage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object modelInput;
     * CfnModelPackageProps cfnModelPackageProps = CfnModelPackageProps.builder()
     * .additionalInferenceSpecifications(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build()))
     * .additionalInferenceSpecificationsToAdd(List.of(AdditionalInferenceSpecificationDefinitionProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build()))
     * .approvalDescription("approvalDescription")
     * .certifyForMarketplace(false)
     * .clientToken("clientToken")
     * .customerMetadataProperties(Map.of(
     * "customerMetadataPropertiesKey", "customerMetadataProperties"))
     * .domain("domain")
     * .driftCheckBaselines(DriftCheckBaselinesProperty.builder()
     * .bias(DriftCheckBiasProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .postTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingConstraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(DriftCheckExplainabilityProperty.builder()
     * .configFile(FileSourceProperty.builder()
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .contentType("contentType")
     * .build())
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(DriftCheckModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(DriftCheckModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build())
     * .inferenceSpecification(InferenceSpecificationProperty.builder()
     * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
     * .image("image")
     * // the properties below are optional
     * .containerHostname("containerHostname")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .imageDigest("imageDigest")
     * .modelDataUrl("modelDataUrl")
     * .modelInput(modelInput)
     * .nearestModelName("nearestModelName")
     * .build()))
     * .supportedContentTypes(List.of("supportedContentTypes"))
     * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
     * // the properties below are optional
     * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
     * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
     * .build())
     * .lastModifiedTime("lastModifiedTime")
     * .metadataProperties(MetadataPropertiesProperty.builder()
     * .commitId("commitId")
     * .generatedBy("generatedBy")
     * .projectId("projectId")
     * .repository("repository")
     * .build())
     * .modelApprovalStatus("modelApprovalStatus")
     * .modelMetrics(ModelMetricsProperty.builder()
     * .bias(BiasProperty.builder()
     * .postTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .preTrainingReport(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .explainability(ExplainabilityProperty.builder()
     * .report(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelDataQuality(ModelDataQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .modelQuality(ModelQualityProperty.builder()
     * .constraints(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .statistics(MetricsSourceProperty.builder()
     * .contentType("contentType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .contentDigest("contentDigest")
     * .build())
     * .build())
     * .build())
     * .modelPackageDescription("modelPackageDescription")
     * .modelPackageGroupName("modelPackageGroupName")
     * .modelPackageName("modelPackageName")
     * .modelPackageStatusDetails(ModelPackageStatusDetailsProperty.builder()
     * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .failureReason("failureReason")
     * .build()))
     * .build())
     * .modelPackageVersion(123)
     * .samplePayloadUrl("samplePayloadUrl")
     * .skipModelValidation("skipModelValidation")
     * .sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty.builder()
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .task("task")
     * .validationSpecification(ValidationSpecificationProperty.builder()
     * .validationProfiles(List.of(ValidationProfileProperty.builder()
     * .profileName("profileName")
     * .transformJobDefinition(TransformJobDefinitionProperty.builder()
     * .transformInput(TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build())
     * .transformOutput(TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .transformResources(TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * // the properties below are optional
     * .batchStrategy("batchStrategy")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .maxConcurrentTransforms(123)
     * .maxPayloadInMb(123)
     * .build())
     * .build()))
     * .validationRole("validationRole")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackage.html)
     */
    public inline fun cfnModelPackageProps(
        block: CfnModelPackagePropsDsl.() -> Unit = {}
    ): CfnModelPackageProps {
        val builder = CfnModelPackagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the S3 data source.
     *
     * Your input bucket must be in the same AWS region as your training job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3DataSourceProperty s3DataSourceProperty = S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-s3datasource.html)
     */
    public inline fun cfnModelPackageS3DataSourceProperty(
        block: CfnModelPackageS3DataSourcePropertyDsl.() -> Unit = {}
    ): CfnModelPackage.S3DataSourceProperty {
        val builder = CfnModelPackageS3DataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an algorithm that was used to create the model package.
     *
     * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm
     * in AWS Marketplace that you are subscribed to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SourceAlgorithmProperty sourceAlgorithmProperty = SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithm.html)
     */
    public inline fun cfnModelPackageSourceAlgorithmProperty(
        block: CfnModelPackageSourceAlgorithmPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.SourceAlgorithmProperty {
        val builder = CfnModelPackageSourceAlgorithmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of algorithms that were used to create a model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SourceAlgorithmSpecificationProperty sourceAlgorithmSpecificationProperty =
     * SourceAlgorithmSpecificationProperty.builder()
     * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
     * .algorithmName("algorithmName")
     * // the properties below are optional
     * .modelDataUrl("modelDataUrl")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-sourcealgorithmspecification.html)
     */
    public inline fun cfnModelPackageSourceAlgorithmSpecificationProperty(
        block: CfnModelPackageSourceAlgorithmSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.SourceAlgorithmSpecificationProperty {
        val builder = CfnModelPackageSourceAlgorithmSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the input source of a transform job and the way the transform job consumes it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TransformInputProperty transformInputProperty = TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transforminput.html)
     */
    public inline fun cfnModelPackageTransformInputProperty(
        block: CfnModelPackageTransformInputPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.TransformInputProperty {
        val builder = CfnModelPackageTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the input needed to run a transform job using the inference specification specified
     * in the algorithm.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TransformJobDefinitionProperty transformJobDefinitionProperty =
     * TransformJobDefinitionProperty.builder()
     * .transformInput(TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build())
     * .transformOutput(TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .transformResources(TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * // the properties below are optional
     * .batchStrategy("batchStrategy")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .maxConcurrentTransforms(123)
     * .maxPayloadInMb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformjobdefinition.html)
     */
    public inline fun cfnModelPackageTransformJobDefinitionProperty(
        block: CfnModelPackageTransformJobDefinitionPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.TransformJobDefinitionProperty {
        val builder = CfnModelPackageTransformJobDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the results of a transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TransformOutputProperty transformOutputProperty = TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformoutput.html)
     */
    public inline fun cfnModelPackageTransformOutputProperty(
        block: CfnModelPackageTransformOutputPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.TransformOutputProperty {
        val builder = CfnModelPackageTransformOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the resources, including ML instance types and ML instance count, to use for
     * transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * TransformResourcesProperty transformResourcesProperty = TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html)
     */
    public inline fun cfnModelPackageTransformResourcesProperty(
        block: CfnModelPackageTransformResourcesPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.TransformResourcesProperty {
        val builder = CfnModelPackageTransformResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains data, such as the inputs and targeted instance types that are used in the process of
     * validating the model package.
     *
     * The data provided in the validation profile is made available to your buyers on AWS
     * Marketplace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ValidationProfileProperty validationProfileProperty = ValidationProfileProperty.builder()
     * .profileName("profileName")
     * .transformJobDefinition(TransformJobDefinitionProperty.builder()
     * .transformInput(TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build())
     * .transformOutput(TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .transformResources(TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * // the properties below are optional
     * .batchStrategy("batchStrategy")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .maxConcurrentTransforms(123)
     * .maxPayloadInMb(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationprofile.html)
     */
    public inline fun cfnModelPackageValidationProfileProperty(
        block: CfnModelPackageValidationProfilePropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ValidationProfileProperty {
        val builder = CfnModelPackageValidationProfilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ValidationSpecificationProperty validationSpecificationProperty =
     * ValidationSpecificationProperty.builder()
     * .validationProfiles(List.of(ValidationProfileProperty.builder()
     * .profileName("profileName")
     * .transformJobDefinition(TransformJobDefinitionProperty.builder()
     * .transformInput(TransformInputProperty.builder()
     * .dataSource(DataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * // the properties below are optional
     * .compressionType("compressionType")
     * .contentType("contentType")
     * .splitType("splitType")
     * .build())
     * .transformOutput(TransformOutputProperty.builder()
     * .s3OutputPath("s3OutputPath")
     * // the properties below are optional
     * .accept("accept")
     * .assembleWith("assembleWith")
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .transformResources(TransformResourcesProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * // the properties below are optional
     * .batchStrategy("batchStrategy")
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .maxConcurrentTransforms(123)
     * .maxPayloadInMb(123)
     * .build())
     * .build()))
     * .validationRole("validationRole")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-validationspecification.html)
     */
    public inline fun cfnModelPackageValidationSpecificationProperty(
        block: CfnModelPackageValidationSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelPackage.ValidationSpecificationProperty {
        val builder = CfnModelPackageValidationSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object environment;
     * CfnModelProps cfnModelProps = CfnModelProps.builder()
     * .containers(List.of(ContainerDefinitionProperty.builder()
     * .containerHostname("containerHostname")
     * .environment(environment)
     * .image("image")
     * .imageConfig(ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build())
     * .inferenceSpecificationName("inferenceSpecificationName")
     * .mode("mode")
     * .modelDataSource(ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build())
     * .modelDataUrl("modelDataUrl")
     * .modelPackageName("modelPackageName")
     * .multiModelConfig(MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build())
     * .build()))
     * .enableNetworkIsolation(false)
     * .executionRoleArn("executionRoleArn")
     * .inferenceExecutionConfig(InferenceExecutionConfigProperty.builder()
     * .mode("mode")
     * .build())
     * .modelName("modelName")
     * .primaryContainer(ContainerDefinitionProperty.builder()
     * .containerHostname("containerHostname")
     * .environment(environment)
     * .image("image")
     * .imageConfig(ImageConfigProperty.builder()
     * .repositoryAccessMode("repositoryAccessMode")
     * // the properties below are optional
     * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build())
     * .build())
     * .inferenceSpecificationName("inferenceSpecificationName")
     * .mode("mode")
     * .modelDataSource(ModelDataSourceProperty.builder()
     * .s3DataSource(S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build())
     * .build())
     * .modelDataUrl("modelDataUrl")
     * .modelPackageName("modelPackageName")
     * .multiModelConfig(MultiModelConfigProperty.builder()
     * .modelCacheSetting("modelCacheSetting")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
     */
    public inline fun cfnModelProps(block: CfnModelPropsDsl.() -> Unit = {}): CfnModelProps {
        val builder = CfnModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a definition for a job that monitors model quality and drift.
     *
     * For information about model monitor, see
     * [Amazon SageMaker Model Monitor](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelQualityJobDefinition cfnModelQualityJobDefinition =
     * CfnModelQualityJobDefinition.Builder.create(this, "MyCfnModelQualityJobDefinition")
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelQualityAppSpecification(ModelQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * .problemType("problemType")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .modelQualityJobInput(ModelQualityJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build())
     * .modelQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelQualityBaselineConfig(ModelQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html)
     */
    public inline fun cfnModelQualityJobDefinition(
        scope: Construct,
        id: String,
        block: CfnModelQualityJobDefinitionDsl.() -> Unit = {},
    ): CfnModelQualityJobDefinition {
        val builder = CfnModelQualityJobDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the batch transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-batchtransforminput.html)
     */
    public inline fun cfnModelQualityJobDefinitionBatchTransformInputProperty(
        block: CfnModelQualityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.BatchTransformInputProperty {
        val builder = CfnModelQualityJobDefinitionBatchTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the cluster of resources used to run the processing job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html)
     */
    public inline fun cfnModelQualityJobDefinitionClusterConfigProperty(
        block: CfnModelQualityJobDefinitionClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.ClusterConfigProperty {
        val builder = CfnModelQualityJobDefinitionClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The constraints resource for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-constraintsresource.html)
     */
    public inline fun cfnModelQualityJobDefinitionConstraintsResourceProperty(
        block: CfnModelQualityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.ConstraintsResourceProperty {
        val builder = CfnModelQualityJobDefinitionConstraintsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CSV format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .header(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-csv.html)
     */
    public inline fun cfnModelQualityJobDefinitionCsvProperty(
        block: CfnModelQualityJobDefinitionCsvPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.CsvProperty {
        val builder = CfnModelQualityJobDefinitionCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset format of the data to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-datasetformat.html)
     */
    public inline fun cfnModelQualityJobDefinitionDatasetFormatProperty(
        block: CfnModelQualityJobDefinitionDatasetFormatPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.DatasetFormatProperty {
        val builder = CfnModelQualityJobDefinitionDatasetFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html)
     */
    public inline fun cfnModelQualityJobDefinitionEndpointInputProperty(
        block: CfnModelQualityJobDefinitionEndpointInputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.EndpointInputProperty {
        val builder = CfnModelQualityJobDefinitionEndpointInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Json format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JsonProperty jsonProperty = JsonProperty.builder()
     * .line(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-json.html)
     */
    public inline fun cfnModelQualityJobDefinitionJsonProperty(
        block: CfnModelQualityJobDefinitionJsonPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.JsonProperty {
        val builder = CfnModelQualityJobDefinitionJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container image configuration object for the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelQualityAppSpecificationProperty modelQualityAppSpecificationProperty =
     * ModelQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * .problemType("problemType")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityappspecification.html)
     */
    public inline fun cfnModelQualityJobDefinitionModelQualityAppSpecificationProperty(
        block: CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty {
        val builder = CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for monitoring constraints and monitoring statistics.
     *
     * These baseline resources are compared against the results of the current job from the series
     * of jobs scheduled to collect data periodically.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelQualityBaselineConfigProperty modelQualityBaselineConfigProperty =
     * ModelQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualitybaselineconfig.html)
     */
    public inline fun cfnModelQualityJobDefinitionModelQualityBaselineConfigProperty(
        block: CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty {
        val builder = CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input for the model quality monitoring job.
     *
     * Currently endpoints are supported for input for model quality monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ModelQualityJobInputProperty modelQualityJobInputProperty =
     * ModelQualityJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html)
     */
    public inline fun cfnModelQualityJobDefinitionModelQualityJobInputProperty(
        block: CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.ModelQualityJobInputProperty {
        val builder = CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ground truth labels for the dataset used for the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringGroundTruthS3InputProperty monitoringGroundTruthS3InputProperty =
     * MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input.html)
     */
    public inline fun cfnModelQualityJobDefinitionMonitoringGroundTruthS3InputProperty(
        block: CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty {
        val builder = CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
     * MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutputconfig.html)
     */
    public inline fun cfnModelQualityJobDefinitionMonitoringOutputConfigProperty(
        block: CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.MonitoringOutputConfigProperty {
        val builder = CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output object for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringoutput.html)
     */
    public inline fun cfnModelQualityJobDefinitionMonitoringOutputProperty(
        block: CfnModelQualityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.MonitoringOutputProperty {
        val builder = CfnModelQualityJobDefinitionMonitoringOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringresources.html)
     */
    public inline fun cfnModelQualityJobDefinitionMonitoringResourcesProperty(
        block: CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.MonitoringResourcesProperty {
        val builder = CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Networking options for a job, such as network traffic encryption between containers, whether
     * to allow inbound and outbound network calls to and from containers, and the VPC subnets and
     * security groups to use for VPC-enabled jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-networkconfig.html)
     */
    public inline fun cfnModelQualityJobDefinitionNetworkConfigProperty(
        block: CfnModelQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.NetworkConfigProperty {
        val builder = CfnModelQualityJobDefinitionNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModelQualityJobDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnModelQualityJobDefinitionProps cfnModelQualityJobDefinitionProps =
     * CfnModelQualityJobDefinitionProps.builder()
     * .jobResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .modelQualityAppSpecification(ModelQualityAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * .problemType("problemType")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .modelQualityJobInput(ModelQualityJobInputProperty.builder()
     * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * // the properties below are optional
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .endTimeOffset("endTimeOffset")
     * .inferenceAttribute("inferenceAttribute")
     * .probabilityAttribute("probabilityAttribute")
     * .probabilityThresholdAttribute(123)
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .startTimeOffset("startTimeOffset")
     * .build())
     * .build())
     * .modelQualityJobOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .jobDefinitionName("jobDefinitionName")
     * .modelQualityBaselineConfig(ModelQualityBaselineConfigProperty.builder()
     * .baseliningJobName("baseliningJobName")
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelqualityjobdefinition.html)
     */
    public inline fun cfnModelQualityJobDefinitionProps(
        block: CfnModelQualityJobDefinitionPropsDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinitionProps {
        val builder = CfnModelQualityJobDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-s3output.html)
     */
    public inline fun cfnModelQualityJobDefinitionS3OutputProperty(
        block: CfnModelQualityJobDefinitionS3OutputPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.S3OutputProperty {
        val builder = CfnModelQualityJobDefinitionS3OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job or model compilation job can run.
     *
     * It also specifies how long a managed spot training job has to complete. When the job reaches
     * the time limit, SageMaker ends the training or compilation job. Use this API to cap model
     * training costs.
     *
     * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
     * termination for 120 seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     *
     * The training algorithms provided by SageMaker automatically save the intermediate results of
     * a model training job when possible. This attempt to save artifacts is only a best effort case
     * as model might not be in a state from which it can be saved. For example, if training has
     * just started, the model might not be ready to save. When saved, this intermediate data is a
     * valid model artifact. You can use it to create a model with `CreateModel` .
     *
     * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
     * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
     * complete.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-stoppingcondition.html)
     */
    public inline fun cfnModelQualityJobDefinitionStoppingConditionProperty(
        block: CfnModelQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.StoppingConditionProperty {
        val builder = CfnModelQualityJobDefinitionStoppingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-vpcconfig.html)
     */
    public inline fun cfnModelQualityJobDefinitionVpcConfigProperty(
        block: CfnModelQualityJobDefinitionVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnModelQualityJobDefinition.VpcConfigProperty {
        val builder = CfnModelQualityJobDefinitionVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an authentication configuration for the private docker registry where your model
     * image is hosted.
     *
     * Specify a value for this property only if you specified `Vpc` as the value for the
     * `RepositoryAccessMode` field of the `ImageConfig` object that you passed to a call to
     * `CreateModel` and the private Docker registry where the model image is hosted requires
     * authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RepositoryAuthConfigProperty repositoryAuthConfigProperty =
     * RepositoryAuthConfigProperty.builder()
     * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-repositoryauthconfig.html)
     */
    public inline fun cfnModelRepositoryAuthConfigProperty(
        block: CfnModelRepositoryAuthConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.RepositoryAuthConfigProperty {
        val builder = CfnModelRepositoryAuthConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the S3 data source.
     *
     * Your input bucket must be in the same AWS region as your training job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3DataSourceProperty s3DataSourceProperty = S3DataSourceProperty.builder()
     * .compressionType("compressionType")
     * .s3DataType("s3DataType")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .modelAccessConfig(ModelAccessConfigProperty.builder()
     * .acceptEula(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-s3datasource.html)
     */
    public inline fun cfnModelS3DataSourceProperty(
        block: CfnModelS3DataSourcePropertyDsl.() -> Unit = {}
    ): CfnModel.S3DataSourceProperty {
        val builder = CfnModelS3DataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html)
     */
    public inline fun cfnModelVpcConfigProperty(
        block: CfnModelVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnModel.VpcConfigProperty {
        val builder = CfnModelVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::MonitoringSchedule` resource is an Amazon SageMaker resource type that
     * regularly starts SageMaker processing Jobs to monitor the data captured for a SageMaker
     * endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnMonitoringSchedule cfnMonitoringSchedule = CfnMonitoringSchedule.Builder.create(this,
     * "MyCfnMonitoringSchedule")
     * .monitoringScheduleConfig(MonitoringScheduleConfigProperty.builder()
     * .monitoringJobDefinition(MonitoringJobDefinitionProperty.builder()
     * .monitoringAppSpecification(MonitoringAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .monitoringInputs(List.of(MonitoringInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build()))
     * .monitoringOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .monitoringResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .baselineConfig(BaselineConfigProperty.builder()
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .build())
     * .monitoringJobDefinitionName("monitoringJobDefinitionName")
     * .monitoringType("monitoringType")
     * .scheduleConfig(ScheduleConfigProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataAnalysisEndTime("dataAnalysisEndTime")
     * .dataAnalysisStartTime("dataAnalysisStartTime")
     * .build())
     * .build())
     * .monitoringScheduleName("monitoringScheduleName")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .failureReason("failureReason")
     * .lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty.builder()
     * .creationTime("creationTime")
     * .lastModifiedTime("lastModifiedTime")
     * .monitoringExecutionStatus("monitoringExecutionStatus")
     * .monitoringScheduleName("monitoringScheduleName")
     * .scheduledTime("scheduledTime")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .failureReason("failureReason")
     * .processingJobArn("processingJobArn")
     * .build())
     * .monitoringScheduleStatus("monitoringScheduleStatus")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html)
     */
    public inline fun cfnMonitoringSchedule(
        scope: Construct,
        id: String,
        block: CfnMonitoringScheduleDsl.() -> Unit = {},
    ): CfnMonitoringSchedule {
        val builder = CfnMonitoringScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Baseline configuration used to validate that the data conforms to the specified constraints
     * and statistics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BaselineConfigProperty baselineConfigProperty = BaselineConfigProperty.builder()
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-baselineconfig.html)
     */
    public inline fun cfnMonitoringScheduleBaselineConfigProperty(
        block: CfnMonitoringScheduleBaselineConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.BaselineConfigProperty {
        val builder = CfnMonitoringScheduleBaselineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the batch transform job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-batchtransforminput.html)
     */
    public inline fun cfnMonitoringScheduleBatchTransformInputProperty(
        block: CfnMonitoringScheduleBatchTransformInputPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.BatchTransformInputProperty {
        val builder = CfnMonitoringScheduleBatchTransformInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for the cluster used to run model monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-clusterconfig.html)
     */
    public inline fun cfnMonitoringScheduleClusterConfigProperty(
        block: CfnMonitoringScheduleClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.ClusterConfigProperty {
        val builder = CfnMonitoringScheduleClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 URI for the constraints resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-constraintsresource.html)
     */
    public inline fun cfnMonitoringScheduleConstraintsResourceProperty(
        block: CfnMonitoringScheduleConstraintsResourcePropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.ConstraintsResourceProperty {
        val builder = CfnMonitoringScheduleConstraintsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The CSV format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .header(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-csv.html)
     */
    public inline fun cfnMonitoringScheduleCsvProperty(
        block: CfnMonitoringScheduleCsvPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.CsvProperty {
        val builder = CfnMonitoringScheduleCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset format of the data to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-datasetformat.html)
     */
    public inline fun cfnMonitoringScheduleDatasetFormatProperty(
        block: CfnMonitoringScheduleDatasetFormatPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.DatasetFormatProperty {
        val builder = CfnMonitoringScheduleDatasetFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input object for the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html)
     */
    public inline fun cfnMonitoringScheduleEndpointInputProperty(
        block: CfnMonitoringScheduleEndpointInputPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.EndpointInputProperty {
        val builder = CfnMonitoringScheduleEndpointInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Json format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JsonProperty jsonProperty = JsonProperty.builder()
     * .line(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-json.html)
     */
    public inline fun cfnMonitoringScheduleJsonProperty(
        block: CfnMonitoringScheduleJsonPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.JsonProperty {
        val builder = CfnMonitoringScheduleJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container image configuration object for the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringAppSpecificationProperty monitoringAppSpecificationProperty =
     * MonitoringAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringAppSpecificationProperty(
        block: CfnMonitoringScheduleMonitoringAppSpecificationPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringAppSpecificationProperty {
        val builder = CfnMonitoringScheduleMonitoringAppSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Summary of information about the last monitoring job to run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringExecutionSummaryProperty monitoringExecutionSummaryProperty =
     * MonitoringExecutionSummaryProperty.builder()
     * .creationTime("creationTime")
     * .lastModifiedTime("lastModifiedTime")
     * .monitoringExecutionStatus("monitoringExecutionStatus")
     * .monitoringScheduleName("monitoringScheduleName")
     * .scheduledTime("scheduledTime")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .failureReason("failureReason")
     * .processingJobArn("processingJobArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringexecutionsummary.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringExecutionSummaryProperty(
        block: CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringExecutionSummaryProperty {
        val builder = CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The inputs for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringInputProperty monitoringInputProperty = MonitoringInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringInputProperty(
        block: CfnMonitoringScheduleMonitoringInputPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringInputProperty {
        val builder = CfnMonitoringScheduleMonitoringInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringJobDefinitionProperty monitoringJobDefinitionProperty =
     * MonitoringJobDefinitionProperty.builder()
     * .monitoringAppSpecification(MonitoringAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .monitoringInputs(List.of(MonitoringInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build()))
     * .monitoringOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .monitoringResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .baselineConfig(BaselineConfigProperty.builder()
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringjobdefinition.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringJobDefinitionProperty(
        block: CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringJobDefinitionProperty {
        val builder = CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for monitoring jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputConfigProperty monitoringOutputConfigProperty =
     * MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutputconfig.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringOutputConfigProperty(
        block: CfnMonitoringScheduleMonitoringOutputConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringOutputConfigProperty {
        val builder = CfnMonitoringScheduleMonitoringOutputConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output object for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringoutput.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringOutputProperty(
        block: CfnMonitoringScheduleMonitoringOutputPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringOutputProperty {
        val builder = CfnMonitoringScheduleMonitoringOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the resources to deploy for a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringResourcesProperty monitoringResourcesProperty = MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringresources.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringResourcesProperty(
        block: CfnMonitoringScheduleMonitoringResourcesPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringResourcesProperty {
        val builder = CfnMonitoringScheduleMonitoringResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the monitoring schedule and defines the monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MonitoringScheduleConfigProperty monitoringScheduleConfigProperty =
     * MonitoringScheduleConfigProperty.builder()
     * .monitoringJobDefinition(MonitoringJobDefinitionProperty.builder()
     * .monitoringAppSpecification(MonitoringAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .monitoringInputs(List.of(MonitoringInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build()))
     * .monitoringOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .monitoringResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .baselineConfig(BaselineConfigProperty.builder()
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .build())
     * .monitoringJobDefinitionName("monitoringJobDefinitionName")
     * .monitoringType("monitoringType")
     * .scheduleConfig(ScheduleConfigProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataAnalysisEndTime("dataAnalysisEndTime")
     * .dataAnalysisStartTime("dataAnalysisStartTime")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringscheduleconfig.html)
     */
    public inline fun cfnMonitoringScheduleMonitoringScheduleConfigProperty(
        block: CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.MonitoringScheduleConfigProperty {
        val builder = CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Networking options for a job, such as network traffic encryption between containers, whether
     * to allow inbound and outbound network calls to and from containers, and the VPC subnets and
     * security groups to use for VPC-enabled jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-networkconfig.html)
     */
    public inline fun cfnMonitoringScheduleNetworkConfigProperty(
        block: CfnMonitoringScheduleNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.NetworkConfigProperty {
        val builder = CfnMonitoringScheduleNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMonitoringSchedule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnMonitoringScheduleProps cfnMonitoringScheduleProps = CfnMonitoringScheduleProps.builder()
     * .monitoringScheduleConfig(MonitoringScheduleConfigProperty.builder()
     * .monitoringJobDefinition(MonitoringJobDefinitionProperty.builder()
     * .monitoringAppSpecification(MonitoringAppSpecificationProperty.builder()
     * .imageUri("imageUri")
     * // the properties below are optional
     * .containerArguments(List.of("containerArguments"))
     * .containerEntrypoint(List.of("containerEntrypoint"))
     * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
     * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
     * .build())
     * .monitoringInputs(List.of(MonitoringInputProperty.builder()
     * .batchTransformInput(BatchTransformInputProperty.builder()
     * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
     * .datasetFormat(DatasetFormatProperty.builder()
     * .csv(CsvProperty.builder()
     * .header(false)
     * .build())
     * .json(JsonProperty.builder()
     * .line(false)
     * .build())
     * .parquet(false)
     * .build())
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .endpointInput(EndpointInputProperty.builder()
     * .endpointName("endpointName")
     * .localPath("localPath")
     * // the properties below are optional
     * .excludeFeaturesAttribute("excludeFeaturesAttribute")
     * .s3DataDistributionType("s3DataDistributionType")
     * .s3InputMode("s3InputMode")
     * .build())
     * .build()))
     * .monitoringOutputConfig(MonitoringOutputConfigProperty.builder()
     * .monitoringOutputs(List.of(MonitoringOutputProperty.builder()
     * .s3Output(S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build())
     * .build()))
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .monitoringResources(MonitoringResourcesProperty.builder()
     * .clusterConfig(ClusterConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .volumeSizeInGb(123)
     * // the properties below are optional
     * .volumeKmsKeyId("volumeKmsKeyId")
     * .build())
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .baselineConfig(BaselineConfigProperty.builder()
     * .constraintsResource(ConstraintsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .statisticsResource(StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build())
     * .build())
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .networkConfig(NetworkConfigProperty.builder()
     * .enableInterContainerTrafficEncryption(false)
     * .enableNetworkIsolation(false)
     * .vpcConfig(VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .stoppingCondition(StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build())
     * .build())
     * .monitoringJobDefinitionName("monitoringJobDefinitionName")
     * .monitoringType("monitoringType")
     * .scheduleConfig(ScheduleConfigProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataAnalysisEndTime("dataAnalysisEndTime")
     * .dataAnalysisStartTime("dataAnalysisStartTime")
     * .build())
     * .build())
     * .monitoringScheduleName("monitoringScheduleName")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .failureReason("failureReason")
     * .lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty.builder()
     * .creationTime("creationTime")
     * .lastModifiedTime("lastModifiedTime")
     * .monitoringExecutionStatus("monitoringExecutionStatus")
     * .monitoringScheduleName("monitoringScheduleName")
     * .scheduledTime("scheduledTime")
     * // the properties below are optional
     * .endpointName("endpointName")
     * .failureReason("failureReason")
     * .processingJobArn("processingJobArn")
     * .build())
     * .monitoringScheduleStatus("monitoringScheduleStatus")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-monitoringschedule.html)
     */
    public inline fun cfnMonitoringScheduleProps(
        block: CfnMonitoringSchedulePropsDsl.() -> Unit = {}
    ): CfnMonitoringScheduleProps {
        val builder = CfnMonitoringSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about where and how you want to store the results of a monitoring job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
     * .localPath("localPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .s3UploadMode("s3UploadMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-s3output.html)
     */
    public inline fun cfnMonitoringScheduleS3OutputProperty(
        block: CfnMonitoringScheduleS3OutputPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.S3OutputProperty {
        val builder = CfnMonitoringScheduleS3OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details about the monitoring schedule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ScheduleConfigProperty scheduleConfigProperty = ScheduleConfigProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataAnalysisEndTime("dataAnalysisEndTime")
     * .dataAnalysisStartTime("dataAnalysisStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html)
     */
    public inline fun cfnMonitoringScheduleScheduleConfigProperty(
        block: CfnMonitoringScheduleScheduleConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.ScheduleConfigProperty {
        val builder = CfnMonitoringScheduleScheduleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The baseline statistics file in Amazon S3 that the current monitoring job should be validated
     * against.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StatisticsResourceProperty statisticsResourceProperty = StatisticsResourceProperty.builder()
     * .s3Uri("s3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-statisticsresource.html)
     */
    public inline fun cfnMonitoringScheduleStatisticsResourceProperty(
        block: CfnMonitoringScheduleStatisticsResourcePropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.StatisticsResourceProperty {
        val builder = CfnMonitoringScheduleStatisticsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a limit to how long a model training job or model compilation job can run.
     *
     * It also specifies how long a managed spot training job has to complete. When the job reaches
     * the time limit, SageMaker ends the training or compilation job. Use this API to cap model
     * training costs.
     *
     * To stop a training job, SageMaker sends the algorithm the `SIGTERM` signal, which delays job
     * termination for 120 seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     *
     * The training algorithms provided by SageMaker automatically save the intermediate results of
     * a model training job when possible. This attempt to save artifacts is only a best effort case
     * as model might not be in a state from which it can be saved. For example, if training has
     * just started, the model might not be ready to save. When saved, this intermediate data is a
     * valid model artifact. You can use it to create a model with `CreateModel` .
     *
     * The Neural Topic Model (NTM) currently does not support saving intermediate model artifacts.
     * When training NTMs, make sure that the maximum runtime is sufficient for the training job to
     * complete.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * StoppingConditionProperty stoppingConditionProperty = StoppingConditionProperty.builder()
     * .maxRuntimeInSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-stoppingcondition.html)
     */
    public inline fun cfnMonitoringScheduleStoppingConditionProperty(
        block: CfnMonitoringScheduleStoppingConditionPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.StoppingConditionProperty {
        val builder = CfnMonitoringScheduleStoppingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Virtual Private Cloud (VPC) that your SageMaker jobs, hosted models, and
     * compute resources have access to.
     *
     * You can control access to and from your resources by configuring a VPC. For more information,
     * see
     * [Give SageMaker Access to Resources in your Amazon VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/infrastructure-give-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-vpcconfig.html)
     */
    public inline fun cfnMonitoringScheduleVpcConfigProperty(
        block: CfnMonitoringScheduleVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSchedule.VpcConfigProperty {
        val builder = CfnMonitoringScheduleVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::NotebookInstance` resource creates an Amazon SageMaker notebook
     * instance.
     *
     * A notebook instance is a machine learning (ML) compute instance running on a Jupyter
     * notebook. For more information, see
     * [Use Notebook Instances](https://docs.aws.amazon.com/sagemaker/latest/dg/nbi.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnNotebookInstance cfnNotebookInstance = CfnNotebookInstance.Builder.create(this,
     * "MyCfnNotebookInstance")
     * .instanceType("instanceType")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .additionalCodeRepositories(List.of("additionalCodeRepositories"))
     * .defaultCodeRepository("defaultCodeRepository")
     * .directInternetAccess("directInternetAccess")
     * .instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty.builder()
     * .minimumInstanceMetadataServiceVersion("minimumInstanceMetadataServiceVersion")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .lifecycleConfigName("lifecycleConfigName")
     * .notebookInstanceName("notebookInstanceName")
     * .platformIdentifier("platformIdentifier")
     * .rootAccess("rootAccess")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .volumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html)
     */
    public inline fun cfnNotebookInstance(
        scope: Construct,
        id: String,
        block: CfnNotebookInstanceDsl.() -> Unit = {},
    ): CfnNotebookInstance {
        val builder = CfnNotebookInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information on the IMDS configuration of the notebook instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * InstanceMetadataServiceConfigurationProperty instanceMetadataServiceConfigurationProperty =
     * InstanceMetadataServiceConfigurationProperty.builder()
     * .minimumInstanceMetadataServiceVersion("minimumInstanceMetadataServiceVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstance-instancemetadataserviceconfiguration.html)
     */
    public inline fun cfnNotebookInstanceInstanceMetadataServiceConfigurationProperty(
        block: CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty {
        val builder = CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::NotebookInstanceLifecycleConfig` resource creates shell scripts that run
     * when you create and/or start a notebook instance.
     *
     * For information about notebook instance lifecycle configurations, see
     * [Customize a Notebook Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html)
     * in the *Amazon SageMaker Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnNotebookInstanceLifecycleConfig cfnNotebookInstanceLifecycleConfig =
     * CfnNotebookInstanceLifecycleConfig.Builder.create(this, "MyCfnNotebookInstanceLifecycleConfig")
     * .notebookInstanceLifecycleConfigName("notebookInstanceLifecycleConfigName")
     * .onCreate(List.of(NotebookInstanceLifecycleHookProperty.builder()
     * .content("content")
     * .build()))
     * .onStart(List.of(NotebookInstanceLifecycleHookProperty.builder()
     * .content("content")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html)
     */
    public inline fun cfnNotebookInstanceLifecycleConfig(
        scope: Construct,
        id: String,
        block: CfnNotebookInstanceLifecycleConfigDsl.() -> Unit = {},
    ): CfnNotebookInstanceLifecycleConfig {
        val builder = CfnNotebookInstanceLifecycleConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the notebook instance lifecycle configuration script.
     *
     * Each lifecycle configuration script has a limit of 16384 characters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NotebookInstanceLifecycleHookProperty notebookInstanceLifecycleHookProperty =
     * NotebookInstanceLifecycleHookProperty.builder()
     * .content("content")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html)
     */
    public inline fun cfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookProperty(
        block:
            CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl.() -> Unit =
            {}
    ): CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty {
        val builder = CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNotebookInstanceLifecycleConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnNotebookInstanceLifecycleConfigProps cfnNotebookInstanceLifecycleConfigProps =
     * CfnNotebookInstanceLifecycleConfigProps.builder()
     * .notebookInstanceLifecycleConfigName("notebookInstanceLifecycleConfigName")
     * .onCreate(List.of(NotebookInstanceLifecycleHookProperty.builder()
     * .content("content")
     * .build()))
     * .onStart(List.of(NotebookInstanceLifecycleHookProperty.builder()
     * .content("content")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html)
     */
    public inline fun cfnNotebookInstanceLifecycleConfigProps(
        block: CfnNotebookInstanceLifecycleConfigPropsDsl.() -> Unit = {}
    ): CfnNotebookInstanceLifecycleConfigProps {
        val builder = CfnNotebookInstanceLifecycleConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNotebookInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnNotebookInstanceProps cfnNotebookInstanceProps = CfnNotebookInstanceProps.builder()
     * .instanceType("instanceType")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .additionalCodeRepositories(List.of("additionalCodeRepositories"))
     * .defaultCodeRepository("defaultCodeRepository")
     * .directInternetAccess("directInternetAccess")
     * .instanceMetadataServiceConfiguration(InstanceMetadataServiceConfigurationProperty.builder()
     * .minimumInstanceMetadataServiceVersion("minimumInstanceMetadataServiceVersion")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .lifecycleConfigName("lifecycleConfigName")
     * .notebookInstanceName("notebookInstanceName")
     * .platformIdentifier("platformIdentifier")
     * .rootAccess("rootAccess")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .volumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstance.html)
     */
    public inline fun cfnNotebookInstanceProps(
        block: CfnNotebookInstancePropsDsl.() -> Unit = {}
    ): CfnNotebookInstanceProps {
        val builder = CfnNotebookInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SageMaker::Pipeline` resource creates shell scripts that run when you create and/or
     * start a SageMaker Pipeline.
     *
     * For information about SageMaker Pipelines, see
     * [SageMaker Pipelines](https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines.html) in the
     * *Amazon SageMaker Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object parallelismConfiguration;
     * Object pipelineDefinition;
     * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
     * .pipelineDefinition(pipelineDefinition)
     * .pipelineName("pipelineName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .parallelismConfiguration(parallelismConfiguration)
     * .pipelineDescription("pipelineDescription")
     * .pipelineDisplayName("pipelineDisplayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html)
     */
    public inline fun cfnPipeline(
        scope: Construct,
        id: String,
        block: CfnPipelineDsl.() -> Unit = {},
    ): CfnPipeline {
        val builder = CfnPipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration that controls the parallelism of the pipeline.
     *
     * By default, the parallelism configuration specified applies to all executions of the pipeline
     * unless overridden.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ParallelismConfigurationProperty parallelismConfigurationProperty =
     * ParallelismConfigurationProperty.builder()
     * .maxParallelExecutionSteps(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-parallelismconfiguration.html)
     */
    public inline fun cfnPipelineParallelismConfigurationProperty(
        block: CfnPipelineParallelismConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ParallelismConfigurationProperty {
        val builder = CfnPipelineParallelismConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The definition of the pipeline.
     *
     * This can be either a JSON string or an Amazon S3 location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * PipelineDefinitionProperty pipelineDefinitionProperty = PipelineDefinitionProperty.builder()
     * .pipelineDefinitionBody("pipelineDefinitionBody")
     * // the properties below are optional
     * .pipelineDefinitionS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .eTag("eTag")
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html)
     */
    public inline fun cfnPipelinePipelineDefinitionProperty(
        block: CfnPipelinePipelineDefinitionPropertyDsl.() -> Unit = {}
    ): CfnPipeline.PipelineDefinitionProperty {
        val builder = CfnPipelinePipelineDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPipeline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object parallelismConfiguration;
     * Object pipelineDefinition;
     * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
     * .pipelineDefinition(pipelineDefinition)
     * .pipelineName("pipelineName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .parallelismConfiguration(parallelismConfiguration)
     * .pipelineDescription("pipelineDescription")
     * .pipelineDisplayName("pipelineDisplayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html)
     */
    public inline fun cfnPipelineProps(
        block: CfnPipelinePropsDsl.() -> Unit = {}
    ): CfnPipelineProps {
        val builder = CfnPipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location of the pipeline definition stored in Amazon S3.
     *
     * If specified, SageMaker will retrieve the pipeline definition from this location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .eTag("eTag")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html)
     */
    public inline fun cfnPipelineS3LocationProperty(
        block: CfnPipelineS3LocationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.S3LocationProperty {
        val builder = CfnPipelineS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a machine learning (ML) project that can contain one or more templates that set up an
     * ML pipeline from training to deploying an approved model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object serviceCatalogProvisioningDetails;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .projectName("projectName")
     * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
     * // the properties below are optional
     * .projectDescription("projectDescription")
     * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
     * .provisionedProductId("provisionedProductId")
     * .provisionedProductStatusMessage("provisionedProductStatusMessage")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * Object serviceCatalogProvisioningDetails;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .projectName("projectName")
     * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
     * // the properties below are optional
     * .projectDescription("projectDescription")
     * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
     * .provisionedProductId("provisionedProductId")
     * .provisionedProductStatusMessage("provisionedProductStatusMessage")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key value pair used when you provision a project as a service catalog product.
     *
     * For information, see
     * [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ProvisioningParameterProperty provisioningParameterProperty =
     * ProvisioningParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-provisioningparameter.html)
     */
    public inline fun cfnProjectProvisioningParameterProperty(
        block: CfnProjectProvisioningParameterPropertyDsl.() -> Unit = {}
    ): CfnProject.ProvisioningParameterProperty {
        val builder = CfnProjectProvisioningParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details of a provisioned service catalog product.
     *
     * For information about service catalog, see
     * [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ServiceCatalogProvisionedProductDetailsProperty serviceCatalogProvisionedProductDetailsProperty
     * = ServiceCatalogProvisionedProductDetailsProperty.builder()
     * .provisionedProductId("provisionedProductId")
     * .provisionedProductStatusMessage("provisionedProductStatusMessage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisionedproductdetails.html)
     */
    public inline fun cfnProjectServiceCatalogProvisionedProductDetailsProperty(
        block: CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl.() -> Unit = {}
    ): CfnProject.ServiceCatalogProvisionedProductDetailsProperty {
        val builder = CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details that you specify to provision a service catalog product.
     *
     * For information about service catalog, see
     * [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ServiceCatalogProvisioningDetailsProperty serviceCatalogProvisioningDetailsProperty =
     * ServiceCatalogProvisioningDetailsProperty.builder()
     * .productId("productId")
     * // the properties below are optional
     * .pathId("pathId")
     * .provisioningArtifactId("provisioningArtifactId")
     * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-project-servicecatalogprovisioningdetails.html)
     */
    public inline fun cfnProjectServiceCatalogProvisioningDetailsProperty(
        block: CfnProjectServiceCatalogProvisioningDetailsPropertyDsl.() -> Unit = {}
    ): CfnProject.ServiceCatalogProvisioningDetailsProperty {
        val builder = CfnProjectServiceCatalogProvisioningDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a space used for real time collaboration in a domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnSpace cfnSpace = CfnSpace.Builder.create(this, "MyCfnSpace")
     * .domainId("domainId")
     * .spaceName("spaceName")
     * // the properties below are optional
     * .ownershipSettings(OwnershipSettingsProperty.builder()
     * .ownerUserProfileName("ownerUserProfileName")
     * .build())
     * .spaceDisplayName("spaceDisplayName")
     * .spaceSettings(SpaceSettingsProperty.builder()
     * .appType("appType")
     * .codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .customFileSystems(List.of(CustomFileSystemProperty.builder()
     * .efsFileSystem(EFSFileSystemProperty.builder()
     * .fileSystemId("fileSystemId")
     * .build())
     * .build()))
     * .jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .spaceStorageSettings(SpaceStorageSettingsProperty.builder()
     * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
     * .ebsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .build())
     * .spaceSharingSettings(SpaceSharingSettingsProperty.builder()
     * .sharingType("sharingType")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html)
     */
    public inline fun cfnSpace(
        scope: Construct,
        id: String,
        block: CfnSpaceDsl.() -> Unit = {},
    ): CfnSpace {
        val builder = CfnSpaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Git repository that SageMaker automatically displays to users for cloning in the
     * JupyterServer application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-coderepository.html)
     */
    public inline fun cfnSpaceCodeRepositoryProperty(
        block: CfnSpaceCodeRepositoryPropertyDsl.() -> Unit = {}
    ): CfnSpace.CodeRepositoryProperty {
        val builder = CfnSpaceCodeRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A file system, created by you, that you assign to a user profile or space for an Amazon
     * SageMaker Domain.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomFileSystemProperty customFileSystemProperty = CustomFileSystemProperty.builder()
     * .efsFileSystem(EFSFileSystemProperty.builder()
     * .fileSystemId("fileSystemId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html)
     */
    public inline fun cfnSpaceCustomFileSystemProperty(
        block: CfnSpaceCustomFileSystemPropertyDsl.() -> Unit = {}
    ): CfnSpace.CustomFileSystemProperty {
        val builder = CfnSpaceCustomFileSystemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom SageMaker image.
     *
     * For more information, see
     * [Bring your own SageMaker image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomImageProperty customImageProperty = CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html)
     */
    public inline fun cfnSpaceCustomImageProperty(
        block: CfnSpaceCustomImagePropertyDsl.() -> Unit = {}
    ): CfnSpace.CustomImageProperty {
        val builder = CfnSpaceCustomImagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A file system, created by you in Amazon EFS, that you assign to a user profile or space for
     * an Amazon SageMaker Domain.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EFSFileSystemProperty eFSFileSystemProperty = EFSFileSystemProperty.builder()
     * .fileSystemId("fileSystemId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-efsfilesystem.html)
     */
    public inline fun cfnSpaceEFSFileSystemProperty(
        block: CfnSpaceEFSFileSystemPropertyDsl.() -> Unit = {}
    ): CfnSpace.EFSFileSystemProperty {
        val builder = CfnSpaceEFSFileSystemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of EBS storage settings that applies to private spaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EbsStorageSettingsProperty ebsStorageSettingsProperty = EbsStorageSettingsProperty.builder()
     * .ebsVolumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ebsstoragesettings.html)
     */
    public inline fun cfnSpaceEbsStorageSettingsProperty(
        block: CfnSpaceEbsStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.EbsStorageSettingsProperty {
        val builder = CfnSpaceEbsStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The JupyterServer app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
     * JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html)
     */
    public inline fun cfnSpaceJupyterServerAppSettingsProperty(
        block: CfnSpaceJupyterServerAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.JupyterServerAppSettingsProperty {
        val builder = CfnSpaceJupyterServerAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The KernelGateway app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
     * KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html)
     */
    public inline fun cfnSpaceKernelGatewayAppSettingsProperty(
        block: CfnSpaceKernelGatewayAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.KernelGatewayAppSettingsProperty {
        val builder = CfnSpaceKernelGatewayAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The collection of ownership settings for a space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * OwnershipSettingsProperty ownershipSettingsProperty = OwnershipSettingsProperty.builder()
     * .ownerUserProfileName("ownerUserProfileName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ownershipsettings.html)
     */
    public inline fun cfnSpaceOwnershipSettingsProperty(
        block: CfnSpaceOwnershipSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.OwnershipSettingsProperty {
        val builder = CfnSpaceOwnershipSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSpace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnSpaceProps cfnSpaceProps = CfnSpaceProps.builder()
     * .domainId("domainId")
     * .spaceName("spaceName")
     * // the properties below are optional
     * .ownershipSettings(OwnershipSettingsProperty.builder()
     * .ownerUserProfileName("ownerUserProfileName")
     * .build())
     * .spaceDisplayName("spaceDisplayName")
     * .spaceSettings(SpaceSettingsProperty.builder()
     * .appType("appType")
     * .codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .customFileSystems(List.of(CustomFileSystemProperty.builder()
     * .efsFileSystem(EFSFileSystemProperty.builder()
     * .fileSystemId("fileSystemId")
     * .build())
     * .build()))
     * .jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .spaceStorageSettings(SpaceStorageSettingsProperty.builder()
     * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
     * .ebsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .build())
     * .spaceSharingSettings(SpaceSharingSettingsProperty.builder()
     * .sharingType("sharingType")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html)
     */
    public inline fun cfnSpaceProps(block: CfnSpacePropsDsl.() -> Unit = {}): CfnSpaceProps {
        val builder = CfnSpacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html)
     */
    public inline fun cfnSpaceResourceSpecProperty(
        block: CfnSpaceResourceSpecPropertyDsl.() -> Unit = {}
    ): CfnSpace.ResourceSpecProperty {
        val builder = CfnSpaceResourceSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The application settings for a Code Editor space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SpaceCodeEditorAppSettingsProperty spaceCodeEditorAppSettingsProperty =
     * SpaceCodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html)
     */
    public inline fun cfnSpaceSpaceCodeEditorAppSettingsProperty(
        block: CfnSpaceSpaceCodeEditorAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.SpaceCodeEditorAppSettingsProperty {
        val builder = CfnSpaceSpaceCodeEditorAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the JupyterLab application within a space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SpaceJupyterLabAppSettingsProperty spaceJupyterLabAppSettingsProperty =
     * SpaceJupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html)
     */
    public inline fun cfnSpaceSpaceJupyterLabAppSettingsProperty(
        block: CfnSpaceSpaceJupyterLabAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.SpaceJupyterLabAppSettingsProperty {
        val builder = CfnSpaceSpaceJupyterLabAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of space settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SpaceSettingsProperty spaceSettingsProperty = SpaceSettingsProperty.builder()
     * .appType("appType")
     * .codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .customFileSystems(List.of(CustomFileSystemProperty.builder()
     * .efsFileSystem(EFSFileSystemProperty.builder()
     * .fileSystemId("fileSystemId")
     * .build())
     * .build()))
     * .jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .spaceStorageSettings(SpaceStorageSettingsProperty.builder()
     * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
     * .ebsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html)
     */
    public inline fun cfnSpaceSpaceSettingsProperty(
        block: CfnSpaceSpaceSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.SpaceSettingsProperty {
        val builder = CfnSpaceSpaceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of space sharing settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SpaceSharingSettingsProperty spaceSharingSettingsProperty =
     * SpaceSharingSettingsProperty.builder()
     * .sharingType("sharingType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesharingsettings.html)
     */
    public inline fun cfnSpaceSpaceSharingSettingsProperty(
        block: CfnSpaceSpaceSharingSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.SpaceSharingSettingsProperty {
        val builder = CfnSpaceSpaceSharingSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The storage settings for a private space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SpaceStorageSettingsProperty spaceStorageSettingsProperty =
     * SpaceStorageSettingsProperty.builder()
     * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
     * .ebsVolumeSizeInGb(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacestoragesettings.html)
     */
    public inline fun cfnSpaceSpaceStorageSettingsProperty(
        block: CfnSpaceSpaceStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnSpace.SpaceStorageSettingsProperty {
        val builder = CfnSpaceSpaceStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a user profile.
     *
     * A user profile represents a single user within a domain, and is the main way to reference a
     * "person" for the purposes of sharing, reporting, and other user-oriented features. This
     * entity is created when a user onboards to Amazon SageMaker Studio. If an administrator
     * invites a person by email or imports them from IAM Identity Center , a user profile is
     * automatically created. A user profile is the primary holder of settings for an individual
     * user and has a reference to the user's private Amazon Elastic File System (EFS) home
     * directory.
     *
     * If you're using IAM Identity Center authentication, a user in IAM Identity Center , or a
     * group in IAM Identity Center containing that user, must be assigned to the Amazon SageMaker
     * Studio application from the IAM Identity Center Console to create a user profile. For more
     * information about application assignment, see
     * [Assign user access](https://docs.aws.amazon.com/singlesignon/latest/userguide/assignuserstoapp.html)
     * . After assignment is complete, a user profile can be created for that user in IAM Identity
     * Center with AWS CloudFormation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
     * .domainId("domainId")
     * .userProfileName("userProfileName")
     * // the properties below are optional
     * .singleSignOnUserIdentifier("singleSignOnUserIdentifier")
     * .singleSignOnUserValue("singleSignOnUserValue")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userSettings(UserSettingsProperty.builder()
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .executionRole("executionRole")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html)
     */
    public inline fun cfnUserProfile(
        scope: Construct,
        id: String,
        block: CfnUserProfileDsl.() -> Unit = {},
    ): CfnUserProfile {
        val builder = CfnUserProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Code Editor application settings.
     *
     * For more information about Code Editor, see
     * [Get started with Code Editor in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/code-editor.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CodeEditorAppSettingsProperty codeEditorAppSettingsProperty =
     * CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html)
     */
    public inline fun cfnUserProfileCodeEditorAppSettingsProperty(
        block: CfnUserProfileCodeEditorAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.CodeEditorAppSettingsProperty {
        val builder = CfnUserProfileCodeEditorAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Git repository that SageMaker automatically displays to users for cloning in the
     * JupyterServer application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-coderepository.html)
     */
    public inline fun cfnUserProfileCodeRepositoryProperty(
        block: CfnUserProfileCodeRepositoryPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.CodeRepositoryProperty {
        val builder = CfnUserProfileCodeRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for assigning a custom file system to a user profile or space for an Amazon
     * SageMaker Domain.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomFileSystemConfigProperty customFileSystemConfigProperty =
     * CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customfilesystemconfig.html)
     */
    public inline fun cfnUserProfileCustomFileSystemConfigProperty(
        block: CfnUserProfileCustomFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.CustomFileSystemConfigProperty {
        val builder = CfnUserProfileCustomFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom SageMaker image.
     *
     * For more information, see
     * [Bring your own SageMaker image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomImageProperty customImageProperty = CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html)
     */
    public inline fun cfnUserProfileCustomImageProperty(
        block: CfnUserProfileCustomImagePropertyDsl.() -> Unit = {}
    ): CfnUserProfile.CustomImageProperty {
        val builder = CfnUserProfileCustomImagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the POSIX identity that is used for file system operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CustomPosixUserConfigProperty customPosixUserConfigProperty =
     * CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html)
     */
    public inline fun cfnUserProfileCustomPosixUserConfigProperty(
        block: CfnUserProfileCustomPosixUserConfigPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.CustomPosixUserConfigProperty {
        val builder = CfnUserProfileCustomPosixUserConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of default EBS storage settings that applies to private spaces created within a
     * domain or user profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DefaultEbsStorageSettingsProperty defaultEbsStorageSettingsProperty =
     * DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html)
     */
    public inline fun cfnUserProfileDefaultEbsStorageSettingsProperty(
        block: CfnUserProfileDefaultEbsStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.DefaultEbsStorageSettingsProperty {
        val builder = CfnUserProfileDefaultEbsStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The default storage settings for a private space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * DefaultSpaceStorageSettingsProperty defaultSpaceStorageSettingsProperty =
     * DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultspacestoragesettings.html)
     */
    public inline fun cfnUserProfileDefaultSpaceStorageSettingsProperty(
        block: CfnUserProfileDefaultSpaceStorageSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.DefaultSpaceStorageSettingsProperty {
        val builder = CfnUserProfileDefaultSpaceStorageSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for assigning a custom Amazon EFS file system to a user profile or space for an
     * Amazon SageMaker Domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * EFSFileSystemConfigProperty eFSFileSystemConfigProperty = EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html)
     */
    public inline fun cfnUserProfileEFSFileSystemConfigProperty(
        block: CfnUserProfileEFSFileSystemConfigPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.EFSFileSystemConfigProperty {
        val builder = CfnUserProfileEFSFileSystemConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for the JupyterLab application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterLabAppSettingsProperty jupyterLabAppSettingsProperty =
     * JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html)
     */
    public inline fun cfnUserProfileJupyterLabAppSettingsProperty(
        block: CfnUserProfileJupyterLabAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.JupyterLabAppSettingsProperty {
        val builder = CfnUserProfileJupyterLabAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The JupyterServer app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
     * JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterserverappsettings.html)
     */
    public inline fun cfnUserProfileJupyterServerAppSettingsProperty(
        block: CfnUserProfileJupyterServerAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.JupyterServerAppSettingsProperty {
        val builder = CfnUserProfileJupyterServerAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The KernelGateway app settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
     * KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html)
     */
    public inline fun cfnUserProfileKernelGatewayAppSettingsProperty(
        block: CfnUserProfileKernelGatewayAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.KernelGatewayAppSettingsProperty {
        val builder = CfnUserProfileKernelGatewayAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnUserProfileProps cfnUserProfileProps = CfnUserProfileProps.builder()
     * .domainId("domainId")
     * .userProfileName("userProfileName")
     * // the properties below are optional
     * .singleSignOnUserIdentifier("singleSignOnUserIdentifier")
     * .singleSignOnUserValue("singleSignOnUserValue")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userSettings(UserSettingsProperty.builder()
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .executionRole("executionRole")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html)
     */
    public inline fun cfnUserProfileProps(
        block: CfnUserProfilePropsDsl.() -> Unit = {}
    ): CfnUserProfileProps {
        val builder = CfnUserProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that configure user interaction with the `RStudioServerPro` app.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * RStudioServerProAppSettingsProperty rStudioServerProAppSettingsProperty =
     * RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html)
     */
    public inline fun cfnUserProfileRStudioServerProAppSettingsProperty(
        block: CfnUserProfileRStudioServerProAppSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.RStudioServerProAppSettingsProperty {
        val builder = CfnUserProfileRStudioServerProAppSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html)
     */
    public inline fun cfnUserProfileResourceSpecProperty(
        block: CfnUserProfileResourceSpecPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.ResourceSpecProperty {
        val builder = CfnUserProfileResourceSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options when sharing an Amazon SageMaker Studio notebook.
     *
     * These settings are specified as part of `DefaultUserSettings` when the
     * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
     * API is called, and as part of `UserSettings` when the
     * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
     * API is called.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * SharingSettingsProperty sharingSettingsProperty = SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html)
     */
    public inline fun cfnUserProfileSharingSettingsProperty(
        block: CfnUserProfileSharingSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.SharingSettingsProperty {
        val builder = CfnUserProfileSharingSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * These settings are specified when the
     * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
     * API is called, and as `DefaultUserSettings` when the
     * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
     * API is called.
     *
     * `SecurityGroups` is aggregated when specified in both calls. For all other settings in
     * `UserSettings` , the values specified in `CreateUserProfile` take precedence over those
     * specified in `CreateDomain` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * UserSettingsProperty userSettingsProperty = UserSettingsProperty.builder()
     * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
     * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .fileSystemPath("fileSystemPath")
     * .build())
     * .build()))
     * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .defaultLandingUri("defaultLandingUri")
     * .executionRole("executionRole")
     * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
     * .codeRepositories(List.of(CodeRepositoryProperty.builder()
     * .repositoryUrl("repositoryUrl")
     * .build()))
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
     * .build())
     * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
     * .customImages(List.of(CustomImageProperty.builder()
     * .appImageConfigName("appImageConfigName")
     * .imageName("imageName")
     * // the properties below are optional
     * .imageVersionNumber(123)
     * .build()))
     * .defaultResourceSpec(ResourceSpecProperty.builder()
     * .instanceType("instanceType")
     * .sageMakerImageArn("sageMakerImageArn")
     * .sageMakerImageVersionArn("sageMakerImageVersionArn")
     * .build())
     * .build())
     * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
     * .accessStatus("accessStatus")
     * .userGroup("userGroup")
     * .build())
     * .securityGroups(List.of("securityGroups"))
     * .sharingSettings(SharingSettingsProperty.builder()
     * .notebookOutputOption("notebookOutputOption")
     * .s3KmsKeyId("s3KmsKeyId")
     * .s3OutputPath("s3OutputPath")
     * .build())
     * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
     * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
     * .defaultEbsVolumeSizeInGb(123)
     * .maximumEbsVolumeSizeInGb(123)
     * .build())
     * .build())
     * .studioWebPortal("studioWebPortal")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html)
     */
    public inline fun cfnUserProfileUserSettingsProperty(
        block: CfnUserProfileUserSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserProfile.UserSettingsProperty {
        val builder = CfnUserProfileUserSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new work team for labeling your data.
     *
     * A work team is defined by one or more Amazon Cognito user pools. You must first create the
     * user pools before you can create a work team.
     *
     * You cannot create more than 25 work teams in an account and region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnWorkteam cfnWorkteam = CfnWorkteam.Builder.create(this, "MyCfnWorkteam")
     * .description("description")
     * .memberDefinitions(List.of(MemberDefinitionProperty.builder()
     * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
     * .cognitoClientId("cognitoClientId")
     * .cognitoUserGroup("cognitoUserGroup")
     * .cognitoUserPool("cognitoUserPool")
     * .build())
     * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
     * .oidcGroups(List.of("oidcGroups"))
     * .build())
     * .build()))
     * .notificationConfiguration(NotificationConfigurationProperty.builder()
     * .notificationTopicArn("notificationTopicArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workforceName("workforceName")
     * .workteamName("workteamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html)
     */
    public inline fun cfnWorkteam(
        scope: Construct,
        id: String,
        block: CfnWorkteamDsl.() -> Unit = {},
    ): CfnWorkteam {
        val builder = CfnWorkteamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a Amazon Cognito user group.
     *
     * A user group can be used in on or more work teams.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CognitoMemberDefinitionProperty cognitoMemberDefinitionProperty =
     * CognitoMemberDefinitionProperty.builder()
     * .cognitoClientId("cognitoClientId")
     * .cognitoUserGroup("cognitoUserGroup")
     * .cognitoUserPool("cognitoUserPool")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html)
     */
    public inline fun cfnWorkteamCognitoMemberDefinitionProperty(
        block: CfnWorkteamCognitoMemberDefinitionPropertyDsl.() -> Unit = {}
    ): CfnWorkteam.CognitoMemberDefinitionProperty {
        val builder = CfnWorkteamCognitoMemberDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an Amazon Cognito or your own OIDC IdP user group that is part of a work team.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * MemberDefinitionProperty memberDefinitionProperty = MemberDefinitionProperty.builder()
     * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
     * .cognitoClientId("cognitoClientId")
     * .cognitoUserGroup("cognitoUserGroup")
     * .cognitoUserPool("cognitoUserPool")
     * .build())
     * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
     * .oidcGroups(List.of("oidcGroups"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html)
     */
    public inline fun cfnWorkteamMemberDefinitionProperty(
        block: CfnWorkteamMemberDefinitionPropertyDsl.() -> Unit = {}
    ): CfnWorkteam.MemberDefinitionProperty {
        val builder = CfnWorkteamMemberDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures Amazon SNS notifications of available or expiring work items for work teams.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * NotificationConfigurationProperty notificationConfigurationProperty =
     * NotificationConfigurationProperty.builder()
     * .notificationTopicArn("notificationTopicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html)
     */
    public inline fun cfnWorkteamNotificationConfigurationProperty(
        block: CfnWorkteamNotificationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWorkteam.NotificationConfigurationProperty {
        val builder = CfnWorkteamNotificationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of user groups that exist in your OIDC Identity Provider (IdP).
     *
     * One to ten groups can be used to create a single private work team. When you add a user group
     * to the list of `Groups` , you can add that user group to one or more private work teams. If
     * you add a user group to a private work team, all workers in that user group are added to the
     * work team.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * OidcMemberDefinitionProperty oidcMemberDefinitionProperty =
     * OidcMemberDefinitionProperty.builder()
     * .oidcGroups(List.of("oidcGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-oidcmemberdefinition.html)
     */
    public inline fun cfnWorkteamOidcMemberDefinitionProperty(
        block: CfnWorkteamOidcMemberDefinitionPropertyDsl.() -> Unit = {}
    ): CfnWorkteam.OidcMemberDefinitionProperty {
        val builder = CfnWorkteamOidcMemberDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkteam`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sagemaker.*;
     * CfnWorkteamProps cfnWorkteamProps = CfnWorkteamProps.builder()
     * .description("description")
     * .memberDefinitions(List.of(MemberDefinitionProperty.builder()
     * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
     * .cognitoClientId("cognitoClientId")
     * .cognitoUserGroup("cognitoUserGroup")
     * .cognitoUserPool("cognitoUserPool")
     * .build())
     * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
     * .oidcGroups(List.of("oidcGroups"))
     * .build())
     * .build()))
     * .notificationConfiguration(NotificationConfigurationProperty.builder()
     * .notificationTopicArn("notificationTopicArn")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workforceName("workforceName")
     * .workteamName("workteamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html)
     */
    public inline fun cfnWorkteamProps(
        block: CfnWorkteamPropsDsl.() -> Unit = {}
    ): CfnWorkteamProps {
        val builder = CfnWorkteamPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
