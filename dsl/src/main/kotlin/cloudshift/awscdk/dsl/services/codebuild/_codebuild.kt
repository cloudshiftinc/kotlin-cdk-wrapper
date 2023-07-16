@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig
import software.amazon.awscdk.services.codebuild.ArtifactsProps
import software.amazon.awscdk.services.codebuild.BatchBuildConfig
import software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.BitBucketSourceProps
import software.amazon.awscdk.services.codebuild.BucketCacheOptions
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildImageBindOptions
import software.amazon.awscdk.services.codebuild.BuildImageConfig
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnProjectProps
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
import software.amazon.awscdk.services.codebuild.CommonProjectProps
import software.amazon.awscdk.services.codebuild.DockerImageOptions
import software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps
import software.amazon.awscdk.services.codebuild.FileSystemConfig
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubSourceProps
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.amazon.awscdk.services.codebuild.S3ArtifactsProps
import software.amazon.awscdk.services.codebuild.S3LoggingOptions
import software.amazon.awscdk.services.codebuild.S3SourceProps
import software.amazon.awscdk.services.codebuild.SourceConfig
import software.amazon.awscdk.services.codebuild.SourceProps
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.constructs.Construct

public object codebuild {
  public inline fun artifactsConfig(block: ArtifactsConfigDsl.() -> Unit = {}): ArtifactsConfig {
    val builder = ArtifactsConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun artifactsProps(block: ArtifactsPropsDsl.() -> Unit = {}): ArtifactsProps {
    val builder = ArtifactsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun batchBuildConfig(block: BatchBuildConfigDsl.() -> Unit = {}): BatchBuildConfig {
    val builder = BatchBuildConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bindToCodePipelineOptions(block: BindToCodePipelineOptionsDsl.() -> Unit = {}):
      BindToCodePipelineOptions {
    val builder = BindToCodePipelineOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bitBucketSourceCredentials(
    scope: Construct,
    id: String,
    block: BitBucketSourceCredentialsDsl.() -> Unit = {},
  ): BitBucketSourceCredentials {
    val builder = BitBucketSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun bitBucketSourceCredentialsProps(block: BitBucketSourceCredentialsPropsDsl.() -> Unit =
      {}): BitBucketSourceCredentialsProps {
    val builder = BitBucketSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bitBucketSourceProps(block: BitBucketSourcePropsDsl.() -> Unit = {}):
      BitBucketSourceProps {
    val builder = BitBucketSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketCacheOptions(block: BucketCacheOptionsDsl.() -> Unit = {}):
      BucketCacheOptions {
    val builder = BucketCacheOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun buildEnvironment(block: BuildEnvironmentDsl.() -> Unit = {}): BuildEnvironment {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun buildEnvironmentCertificate(block: BuildEnvironmentCertificateDsl.() -> Unit =
      {}): BuildEnvironmentCertificate {
    val builder = BuildEnvironmentCertificateDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun buildEnvironmentVariable(block: BuildEnvironmentVariableDsl.() -> Unit = {}):
      BuildEnvironmentVariable {
    val builder = BuildEnvironmentVariableDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun buildImageBindOptions(block: BuildImageBindOptionsDsl.() -> Unit = {}):
      BuildImageBindOptions {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun buildImageConfig(block: BuildImageConfigDsl.() -> Unit = {}): BuildImageConfig {
    val builder = BuildImageConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectArtifactsProperty(block: CfnProjectArtifactsPropertyDsl.() -> Unit =
      {}): CfnProject.ArtifactsProperty {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectBatchRestrictionsProperty(block: CfnProjectBatchRestrictionsPropertyDsl.() -> Unit
      = {}): CfnProject.BatchRestrictionsProperty {
    val builder = CfnProjectBatchRestrictionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectBuildStatusConfigProperty(block: CfnProjectBuildStatusConfigPropertyDsl.() -> Unit
      = {}): CfnProject.BuildStatusConfigProperty {
    val builder = CfnProjectBuildStatusConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectCloudWatchLogsConfigProperty(block: CfnProjectCloudWatchLogsConfigPropertyDsl.() -> Unit
      = {}): CfnProject.CloudWatchLogsConfigProperty {
    val builder = CfnProjectCloudWatchLogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectEnvironmentProperty(block: CfnProjectEnvironmentPropertyDsl.() -> Unit
      = {}): CfnProject.EnvironmentProperty {
    val builder = CfnProjectEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectEnvironmentVariableProperty(block: CfnProjectEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnProject.EnvironmentVariableProperty {
    val builder = CfnProjectEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectGitSubmodulesConfigProperty(block: CfnProjectGitSubmodulesConfigPropertyDsl.() -> Unit
      = {}): CfnProject.GitSubmodulesConfigProperty {
    val builder = CfnProjectGitSubmodulesConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectLogsConfigProperty(block: CfnProjectLogsConfigPropertyDsl.() -> Unit =
      {}): CfnProject.LogsConfigProperty {
    val builder = CfnProjectLogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProjectBuildBatchConfigProperty(block: CfnProjectProjectBuildBatchConfigPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectBuildBatchConfigProperty {
    val builder = CfnProjectProjectBuildBatchConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProjectCacheProperty(block: CfnProjectProjectCachePropertyDsl.() -> Unit = {}):
      CfnProject.ProjectCacheProperty {
    val builder = CfnProjectProjectCachePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProjectFileSystemLocationProperty(block: CfnProjectProjectFileSystemLocationPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectFileSystemLocationProperty {
    val builder = CfnProjectProjectFileSystemLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProjectSourceVersionProperty(block: CfnProjectProjectSourceVersionPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectSourceVersionProperty {
    val builder = CfnProjectProjectSourceVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProjectTriggersProperty(block: CfnProjectProjectTriggersPropertyDsl.() -> Unit =
      {}): CfnProject.ProjectTriggersProperty {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectRegistryCredentialProperty(block: CfnProjectRegistryCredentialPropertyDsl.() -> Unit
      = {}): CfnProject.RegistryCredentialProperty {
    val builder = CfnProjectRegistryCredentialPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectS3LogsConfigProperty(block: CfnProjectS3LogsConfigPropertyDsl.() -> Unit = {}):
      CfnProject.S3LogsConfigProperty {
    val builder = CfnProjectS3LogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectSourceAuthProperty(block: CfnProjectSourceAuthPropertyDsl.() -> Unit =
      {}): CfnProject.SourceAuthProperty {
    val builder = CfnProjectSourceAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectSourceProperty(block: CfnProjectSourcePropertyDsl.() -> Unit = {}):
      CfnProject.SourceProperty {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectVpcConfigProperty(block: CfnProjectVpcConfigPropertyDsl.() -> Unit =
      {}): CfnProject.VpcConfigProperty {
    val builder = CfnProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectWebhookFilterProperty(block: CfnProjectWebhookFilterPropertyDsl.() -> Unit =
      {}): CfnProject.WebhookFilterProperty {
    val builder = CfnProjectWebhookFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReportGroup(
    scope: Construct,
    id: String,
    block: CfnReportGroupDsl.() -> Unit = {},
  ): CfnReportGroup {
    val builder = CfnReportGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReportGroupProps(block: CfnReportGroupPropsDsl.() -> Unit = {}):
      CfnReportGroupProps {
    val builder = CfnReportGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReportGroupReportExportConfigProperty(block: CfnReportGroupReportExportConfigPropertyDsl.() -> Unit
      = {}): CfnReportGroup.ReportExportConfigProperty {
    val builder = CfnReportGroupReportExportConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReportGroupS3ReportExportConfigProperty(block: CfnReportGroupS3ReportExportConfigPropertyDsl.() -> Unit
      = {}): CfnReportGroup.S3ReportExportConfigProperty {
    val builder = CfnReportGroupS3ReportExportConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSourceCredential(
    scope: Construct,
    id: String,
    block: CfnSourceCredentialDsl.() -> Unit = {},
  ): CfnSourceCredential {
    val builder = CfnSourceCredentialDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSourceCredentialProps(block: CfnSourceCredentialPropsDsl.() -> Unit = {}):
      CfnSourceCredentialProps {
    val builder = CfnSourceCredentialPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudWatchLoggingOptions(block: CloudWatchLoggingOptionsDsl.() -> Unit = {}):
      CloudWatchLoggingOptions {
    val builder = CloudWatchLoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeCommitSourceProps(block: CodeCommitSourcePropsDsl.() -> Unit = {}):
      CodeCommitSourceProps {
    val builder = CodeCommitSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonProjectProps(block: CommonProjectPropsDsl.() -> Unit = {}):
      CommonProjectProps {
    val builder = CommonProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageOptions(block: DockerImageOptionsDsl.() -> Unit = {}):
      DockerImageOptions {
    val builder = DockerImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun efsFileSystemLocationProps(block: EfsFileSystemLocationPropsDsl.() -> Unit =
      {}): EfsFileSystemLocationProps {
    val builder = EfsFileSystemLocationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileSystemConfig(block: FileSystemConfigDsl.() -> Unit = {}): FileSystemConfig {
    val builder = FileSystemConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gitHubEnterpriseSourceCredentials(
    scope: Construct,
    id: String,
    block: GitHubEnterpriseSourceCredentialsDsl.() -> Unit = {},
  ): GitHubEnterpriseSourceCredentials {
    val builder = GitHubEnterpriseSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun gitHubEnterpriseSourceCredentialsProps(block: GitHubEnterpriseSourceCredentialsPropsDsl.() -> Unit
      = {}): GitHubEnterpriseSourceCredentialsProps {
    val builder = GitHubEnterpriseSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gitHubEnterpriseSourceProps(block: GitHubEnterpriseSourcePropsDsl.() -> Unit =
      {}): GitHubEnterpriseSourceProps {
    val builder = GitHubEnterpriseSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gitHubSourceCredentials(
    scope: Construct,
    id: String,
    block: GitHubSourceCredentialsDsl.() -> Unit = {},
  ): GitHubSourceCredentials {
    val builder = GitHubSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun gitHubSourceCredentialsProps(block: GitHubSourceCredentialsPropsDsl.() -> Unit =
      {}): GitHubSourceCredentialsProps {
    val builder = GitHubSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gitHubSourceProps(block: GitHubSourcePropsDsl.() -> Unit = {}):
      GitHubSourceProps {
    val builder = GitHubSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loggingOptions(block: LoggingOptionsDsl.() -> Unit = {}): LoggingOptions {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun pipelineProject(
    scope: Construct,
    id: String,
    block: PipelineProjectDsl.() -> Unit = {},
  ): PipelineProject {
    val builder = PipelineProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun pipelineProjectProps(block: PipelineProjectPropsDsl.() -> Unit = {}):
      PipelineProjectProps {
    val builder = PipelineProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun project(
    scope: Construct,
    id: String,
    block: ProjectDsl.() -> Unit = {},
  ): Project {
    val builder = ProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun projectNotifyOnOptions(block: ProjectNotifyOnOptionsDsl.() -> Unit = {}):
      ProjectNotifyOnOptions {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun projectProps(block: ProjectPropsDsl.() -> Unit = {}): ProjectProps {
    val builder = ProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun reportGroup(
    scope: Construct,
    id: String,
    block: ReportGroupDsl.() -> Unit = {},
  ): ReportGroup {
    val builder = ReportGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun reportGroupProps(block: ReportGroupPropsDsl.() -> Unit = {}): ReportGroupProps {
    val builder = ReportGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3ArtifactsProps(block: S3ArtifactsPropsDsl.() -> Unit = {}): S3ArtifactsProps {
    val builder = S3ArtifactsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3LoggingOptions(block: S3LoggingOptionsDsl.() -> Unit = {}): S3LoggingOptions {
    val builder = S3LoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3SourceProps(block: S3SourcePropsDsl.() -> Unit = {}): S3SourceProps {
    val builder = S3SourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sourceConfig(block: SourceConfigDsl.() -> Unit = {}): SourceConfig {
    val builder = SourceConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sourceProps(block: SourcePropsDsl.() -> Unit = {}): SourceProps {
    val builder = SourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun untrustedCodeBoundaryPolicy(
    scope: Construct,
    id: String,
    block: UntrustedCodeBoundaryPolicyDsl.() -> Unit = {},
  ): UntrustedCodeBoundaryPolicy {
    val builder = UntrustedCodeBoundaryPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun untrustedCodeBoundaryPolicyProps(block: UntrustedCodeBoundaryPolicyPropsDsl.() -> Unit =
      {}): UntrustedCodeBoundaryPolicyProps {
    val builder = UntrustedCodeBoundaryPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
