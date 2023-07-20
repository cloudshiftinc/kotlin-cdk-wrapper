@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.amazon.awscdk.services.transfer.CfnAgreementProps
import software.amazon.awscdk.services.transfer.CfnCertificate
import software.amazon.awscdk.services.transfer.CfnCertificateProps
import software.amazon.awscdk.services.transfer.CfnConnector
import software.amazon.awscdk.services.transfer.CfnConnectorProps
import software.amazon.awscdk.services.transfer.CfnProfile
import software.amazon.awscdk.services.transfer.CfnProfileProps
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnServerProps
import software.amazon.awscdk.services.transfer.CfnUser
import software.amazon.awscdk.services.transfer.CfnUserProps
import software.amazon.awscdk.services.transfer.CfnWorkflow
import software.amazon.awscdk.services.transfer.CfnWorkflowProps
import software.constructs.Construct

public object transfer {
  public inline fun cfnAgreement(
    scope: Construct,
    id: String,
    block: CfnAgreementDsl.() -> Unit = {},
  ): CfnAgreement {
    val builder = CfnAgreementDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAgreementProps(block: CfnAgreementPropsDsl.() -> Unit = {}):
      CfnAgreementProps {
    val builder = CfnAgreementPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCertificate(
    scope: Construct,
    id: String,
    block: CfnCertificateDsl.() -> Unit = {},
  ): CfnCertificate {
    val builder = CfnCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCertificateProps(block: CfnCertificatePropsDsl.() -> Unit = {}):
      CfnCertificateProps {
    val builder = CfnCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnector(
    scope: Construct,
    id: String,
    block: CfnConnectorDsl.() -> Unit = {},
  ): CfnConnector {
    val builder = CfnConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorAs2ConfigProperty(block: CfnConnectorAs2ConfigPropertyDsl.() -> Unit
      = {}): CfnConnector.As2ConfigProperty {
    val builder = CfnConnectorAs2ConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorProps(block: CfnConnectorPropsDsl.() -> Unit = {}):
      CfnConnectorProps {
    val builder = CfnConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProfile(
    scope: Construct,
    id: String,
    block: CfnProfileDsl.() -> Unit = {},
  ): CfnProfile {
    val builder = CfnProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProfileProps(block: CfnProfilePropsDsl.() -> Unit = {}): CfnProfileProps {
    val builder = CfnProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServer(
    scope: Construct,
    id: String,
    block: CfnServerDsl.() -> Unit = {},
  ): CfnServer {
    val builder = CfnServerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerEndpointDetailsProperty(block: CfnServerEndpointDetailsPropertyDsl.() -> Unit =
      {}): CfnServer.EndpointDetailsProperty {
    val builder = CfnServerEndpointDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerIdentityProviderDetailsProperty(block: CfnServerIdentityProviderDetailsPropertyDsl.() -> Unit
      = {}): CfnServer.IdentityProviderDetailsProperty {
    val builder = CfnServerIdentityProviderDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServerProps(block: CfnServerPropsDsl.() -> Unit = {}): CfnServerProps {
    val builder = CfnServerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerProtocolDetailsProperty(block: CfnServerProtocolDetailsPropertyDsl.() -> Unit =
      {}): CfnServer.ProtocolDetailsProperty {
    val builder = CfnServerProtocolDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServerProtocolProperty(block: CfnServerProtocolPropertyDsl.() -> Unit = {}):
      CfnServer.ProtocolProperty {
    val builder = CfnServerProtocolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerStructuredLogDestinationProperty(block: CfnServerStructuredLogDestinationPropertyDsl.() -> Unit
      = {}): CfnServer.StructuredLogDestinationProperty {
    val builder = CfnServerStructuredLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerWorkflowDetailProperty(block: CfnServerWorkflowDetailPropertyDsl.() -> Unit =
      {}): CfnServer.WorkflowDetailProperty {
    val builder = CfnServerWorkflowDetailPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServerWorkflowDetailsProperty(block: CfnServerWorkflowDetailsPropertyDsl.() -> Unit =
      {}): CfnServer.WorkflowDetailsProperty {
    val builder = CfnServerWorkflowDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUser(
    scope: Construct,
    id: String,
    block: CfnUserDsl.() -> Unit = {},
  ): CfnUser {
    val builder = CfnUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserHomeDirectoryMapEntryProperty(block: CfnUserHomeDirectoryMapEntryPropertyDsl.() -> Unit
      = {}): CfnUser.HomeDirectoryMapEntryProperty {
    val builder = CfnUserHomeDirectoryMapEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPosixProfileProperty(block: CfnUserPosixProfilePropertyDsl.() -> Unit =
      {}): CfnUser.PosixProfileProperty {
    val builder = CfnUserPosixProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
    val builder = CfnUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserSshPublicKeyProperty(block: CfnUserSshPublicKeyPropertyDsl.() -> Unit =
      {}): CfnUser.SshPublicKeyProperty {
    val builder = CfnUserSshPublicKeyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkflow(
    scope: Construct,
    id: String,
    block: CfnWorkflowDsl.() -> Unit = {},
  ): CfnWorkflow {
    val builder = CfnWorkflowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowCopyStepDetailsProperty(block: CfnWorkflowCopyStepDetailsPropertyDsl.() -> Unit
      = {}): CfnWorkflow.CopyStepDetailsProperty {
    val builder = CfnWorkflowCopyStepDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowCustomStepDetailsProperty(block: CfnWorkflowCustomStepDetailsPropertyDsl.() -> Unit
      = {}): CfnWorkflow.CustomStepDetailsProperty {
    val builder = CfnWorkflowCustomStepDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowDecryptStepDetailsProperty(block: CfnWorkflowDecryptStepDetailsPropertyDsl.() -> Unit
      = {}): CfnWorkflow.DecryptStepDetailsProperty {
    val builder = CfnWorkflowDecryptStepDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowDeleteStepDetailsProperty(block: CfnWorkflowDeleteStepDetailsPropertyDsl.() -> Unit
      = {}): CfnWorkflow.DeleteStepDetailsProperty {
    val builder = CfnWorkflowDeleteStepDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowEfsInputFileLocationProperty(block: CfnWorkflowEfsInputFileLocationPropertyDsl.() -> Unit
      = {}): CfnWorkflow.EfsInputFileLocationProperty {
    val builder = CfnWorkflowEfsInputFileLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowInputFileLocationProperty(block: CfnWorkflowInputFileLocationPropertyDsl.() -> Unit
      = {}): CfnWorkflow.InputFileLocationProperty {
    val builder = CfnWorkflowInputFileLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkflowProps(block: CfnWorkflowPropsDsl.() -> Unit = {}): CfnWorkflowProps {
    val builder = CfnWorkflowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowS3FileLocationProperty(block: CfnWorkflowS3FileLocationPropertyDsl.() -> Unit =
      {}): CfnWorkflow.S3FileLocationProperty {
    val builder = CfnWorkflowS3FileLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowS3InputFileLocationProperty(block: CfnWorkflowS3InputFileLocationPropertyDsl.() -> Unit
      = {}): CfnWorkflow.S3InputFileLocationProperty {
    val builder = CfnWorkflowS3InputFileLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkflowS3TagProperty(block: CfnWorkflowS3TagPropertyDsl.() -> Unit = {}):
      CfnWorkflow.S3TagProperty {
    val builder = CfnWorkflowS3TagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowTagStepDetailsProperty(block: CfnWorkflowTagStepDetailsPropertyDsl.() -> Unit =
      {}): CfnWorkflow.TagStepDetailsProperty {
    val builder = CfnWorkflowTagStepDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowWorkflowStepProperty(block: CfnWorkflowWorkflowStepPropertyDsl.() -> Unit =
      {}): CfnWorkflow.WorkflowStepProperty {
    val builder = CfnWorkflowWorkflowStepPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
