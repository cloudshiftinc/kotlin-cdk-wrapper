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

package io.cloudshiftdev.awscdkdsl.services.transfer

import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnConnector
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnUser

/** A structure that contains the parameters for an SFTP connector object. */
public inline fun CfnConnector.setSftpConfig(
    block: CfnConnectorSftpConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorSftpConfigPropertyDsl()
    builder.apply(block)
    return setSftpConfig(builder.build())
}

/** The virtual private cloud (VPC) endpoint settings that are configured for your server. */
public inline fun CfnServer.setEndpointDetails(
    block: CfnServerEndpointDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerEndpointDetailsPropertyDsl()
    builder.apply(block)
    return setEndpointDetails(builder.build())
}

/**
 * Required when `IdentityProviderType` is set to `AWS_DIRECTORY_SERVICE` , `AWS _LAMBDA` or
 * `API_GATEWAY` .
 */
public inline fun CfnServer.setIdentityProviderDetails(
    block: CfnServerIdentityProviderDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerIdentityProviderDetailsPropertyDsl()
    builder.apply(block)
    return setIdentityProviderDetails(builder.build())
}

/** The protocol settings that are configured for your server. */
public inline fun CfnServer.setProtocolDetails(
    block: CfnServerProtocolDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerProtocolDetailsPropertyDsl()
    builder.apply(block)
    return setProtocolDetails(builder.build())
}

/**
 * Specifies the workflow ID for the workflow to assign and the execution role that's used for
 * executing the workflow.
 */
public inline fun CfnServer.setWorkflowDetails(
    block: CfnServerWorkflowDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServerWorkflowDetailsPropertyDsl()
    builder.apply(block)
    return setWorkflowDetails(builder.build())
}

/**
 * Specifies the full POSIX identity, including user ID ( `Uid` ), group ID ( `Gid` ), and any
 * secondary groups IDs ( `SecondaryGids` ), that controls your users' access to your Amazon Elastic
 * File System (Amazon EFS) file systems.
 */
public inline fun CfnUser.setPosixProfile(block: CfnUserPosixProfilePropertyDsl.() -> Unit = {}) {
    val builder = CfnUserPosixProfilePropertyDsl()
    builder.apply(block)
    return setPosixProfile(builder.build())
}
