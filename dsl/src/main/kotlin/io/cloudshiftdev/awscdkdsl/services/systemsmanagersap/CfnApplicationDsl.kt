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
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication
import software.constructs.Construct

/**
 * An SAP application registered with AWS Systems Manager for SAP.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.systemsmanagersap.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
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
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _credentials: MutableList<Any> = mutableListOf()

    private val _instances: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationid)
     *
     * @param applicationId The ID of the application.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The type of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationtype)
     *
     * @param applicationType The type of the application.
     */
    public fun applicationType(applicationType: String) {
        cdkBuilder.applicationType(applicationType)
    }

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     *
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(vararg credentials: Any) {
        _credentials.addAll(listOf(*credentials))
    }

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     *
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(credentials: Collection<Any>) {
        _credentials.addAll(credentials)
    }

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     *
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     *
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    public fun instances(vararg instances: String) {
        _instances.addAll(listOf(*instances))
    }

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     *
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    public fun instances(instances: Collection<String>) {
        _instances.addAll(instances)
    }

    /**
     * The SAP instance number of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sapinstancenumber)
     *
     * @param sapInstanceNumber The SAP instance number of the application.
     */
    public fun sapInstanceNumber(sapInstanceNumber: String) {
        cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    /**
     * The System ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sid)
     *
     * @param sid The System ID of the application.
     */
    public fun sid(sid: String) {
        cdkBuilder.sid(sid)
    }

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     *
     * @param tags The tags on the application.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     *
     * @param tags The tags on the application.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplication {
        if (_credentials.isNotEmpty()) cdkBuilder.credentials(_credentials)
        if (_instances.isNotEmpty()) cdkBuilder.instances(_instances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
