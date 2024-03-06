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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/** The source of the analysis template. */
public inline fun CfnAnalysisTemplate.setSource(
    block: CfnAnalysisTemplateAnalysisSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnalysisTemplateAnalysisSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

/**
 * An object representing the collaboration member's payment responsibilities set by the
 * collaboration creator.
 */
public inline fun CfnCollaboration.setCreatorPaymentConfiguration(
    block: CfnCollaborationPaymentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCollaborationPaymentConfigurationPropertyDsl()
    builder.apply(block)
    return setCreatorPaymentConfiguration(builder.build())
}

/** The settings for client-side encryption for cryptographic computing. */
public inline fun CfnCollaboration.setDataEncryptionMetadata(
    block: CfnCollaborationDataEncryptionMetadataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCollaborationDataEncryptionMetadataPropertyDsl()
    builder.apply(block)
    return setDataEncryptionMetadata(builder.build())
}

/** The AWS Glue table that this configured table represents. */
public inline fun CfnConfiguredTable.setTableReference(
    block: CfnConfiguredTableTableReferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfiguredTableTableReferencePropertyDsl()
    builder.apply(block)
    return setTableReference(builder.build())
}

/**
 * The default protected query result configuration as specified by the member who can receive
 * results.
 */
public inline fun CfnMembership.setDefaultResultConfiguration(
    block: CfnMembershipMembershipProtectedQueryResultConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMembershipMembershipProtectedQueryResultConfigurationPropertyDsl()
    builder.apply(block)
    return setDefaultResultConfiguration(builder.build())
}

/** The payment responsibilities accepted by the collaboration member. */
public inline fun CfnMembership.setPaymentConfiguration(
    block: CfnMembershipMembershipPaymentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMembershipMembershipPaymentConfigurationPropertyDsl()
    builder.apply(block)
    return setPaymentConfiguration(builder.build())
}
