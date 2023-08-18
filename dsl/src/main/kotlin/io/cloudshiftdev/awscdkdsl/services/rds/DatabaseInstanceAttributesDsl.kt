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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.DatabaseInstanceAttributes
import software.amazon.awscdk.services.rds.IInstanceEngine

/**
 * Properties that describe an existing instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
 * IInstanceEngine instanceEngine;
 * SecurityGroup securityGroup;
 * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
 * .instanceEndpointAddress("instanceEndpointAddress")
 * .instanceIdentifier("instanceIdentifier")
 * .port(123)
 * .securityGroups(List.of(securityGroup))
 * // the properties below are optional
 * .engine(instanceEngine)
 * .instanceResourceId("instanceResourceId")
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseInstanceAttributesDsl {
    private val cdkBuilder: DatabaseInstanceAttributes.Builder =
        DatabaseInstanceAttributes.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param engine The engine of the existing database Instance. */
    public fun engine(engine: IInstanceEngine) {
        cdkBuilder.engine(engine)
    }

    /** @param instanceEndpointAddress The endpoint address. */
    public fun instanceEndpointAddress(instanceEndpointAddress: String) {
        cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    /** @param instanceIdentifier The instance identifier. */
    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param instanceResourceId The AWS Region-unique, immutable identifier for the DB instance.
     *   This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     *   instance is accessed.
     */
    public fun instanceResourceId(instanceResourceId: String) {
        cdkBuilder.instanceResourceId(instanceResourceId)
    }

    /** @param port The database port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param securityGroups The security groups of the instance. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups of the instance. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): DatabaseInstanceAttributes {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
