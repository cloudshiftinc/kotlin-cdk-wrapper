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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorad.CfnConnector
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry

/** Information of the VPC and security group(s) used with the connector. */
public inline fun CfnConnector.setVpcInformation(
    block: CfnConnectorVpcInformationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectorVpcInformationPropertyDsl()
    builder.apply(block)
    return setVpcInformation(builder.build())
}

/** Template configuration to define the information included in certificates. */
public inline fun CfnTemplate.setDefinition(
    block: CfnTemplateTemplateDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTemplateTemplateDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/**
 * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
 * issued against a template.
 */
public inline fun CfnTemplateGroupAccessControlEntry.setAccessRights(
    block: CfnTemplateGroupAccessControlEntryAccessRightsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTemplateGroupAccessControlEntryAccessRightsPropertyDsl()
    builder.apply(block)
    return setAccessRights(builder.build())
}
