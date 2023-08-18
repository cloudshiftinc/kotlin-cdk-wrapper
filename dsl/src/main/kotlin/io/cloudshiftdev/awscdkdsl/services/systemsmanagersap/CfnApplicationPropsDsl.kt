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

package io.cloudshiftdev.awscdkdsl.services.systemsmanagersap

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.systemsmanagersap.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationId("applicationId")
 * .applicationType("applicationType")
 * // the properties below are optional
 * .credentials(List.of(CredentialProperty.builder()
 * .credentialType("credentialType")
 * .databaseName("databaseName")
 * .secretId("secretId")
 * .build()))
 * .instances(List.of("instances"))
 * .sapInstanceNumber("sapInstanceNumber")
 * .sid("sid")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _credentials: MutableList<Any> = mutableListOf()

    private val _instances: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param applicationId The ID of the application. */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /** @param applicationType The type of the application. */
    public fun applicationType(applicationType: String) {
        cdkBuilder.applicationType(applicationType)
    }

    /** @param credentials The credentials of the SAP application. */
    public fun credentials(vararg credentials: Any) {
        _credentials.addAll(listOf(*credentials))
    }

    /** @param credentials The credentials of the SAP application. */
    public fun credentials(credentials: Collection<Any>) {
        _credentials.addAll(credentials)
    }

    /** @param credentials The credentials of the SAP application. */
    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    /** @param instances The Amazon EC2 instances on which your SAP application is running. */
    public fun instances(vararg instances: String) {
        _instances.addAll(listOf(*instances))
    }

    /** @param instances The Amazon EC2 instances on which your SAP application is running. */
    public fun instances(instances: Collection<String>) {
        _instances.addAll(instances)
    }

    /** @param sapInstanceNumber The SAP instance number of the application. */
    public fun sapInstanceNumber(sapInstanceNumber: String) {
        cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    /** @param sid The System ID of the application. */
    public fun sid(sid: String) {
        cdkBuilder.sid(sid)
    }

    /** @param tags The tags on the application. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags on the application. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationProps {
        if (_credentials.isNotEmpty()) cdkBuilder.credentials(_credentials)
        if (_instances.isNotEmpty()) cdkBuilder.instances(_instances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
