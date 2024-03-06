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

package io.cloudshiftdev.awscdkdsl.services.rolesanywhere

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnProfileProps

/**
 * Properties for defining a `CfnProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
 * .name("name")
 * .roleArns(List.of("roleArns"))
 * // the properties below are optional
 * .durationSeconds(123)
 * .enabled(false)
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .requireInstanceProperties(false)
 * .sessionPolicy("sessionPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html)
 */
@CdkDslMarker
public class CfnProfilePropsDsl {
    private val cdkBuilder: CfnProfileProps.Builder = CfnProfileProps.builder()

    private val _managedPolicyArns: MutableList<String> = mutableListOf()

    private val _roleArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param durationSeconds The number of seconds vended session credentials will be valid for.
     */
    public fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
    }

    /** @param enabled The enabled status of the resource. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled The enabled status of the resource. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs. Managed policies identified by this
     *   list will be applied to the vended session credentials.
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs. Managed policies identified by this
     *   list will be applied to the vended session credentials.
     */
    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    /** @param name The customer specified name of the resource. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     *   CreateSession requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: Boolean) {
        cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     *   CreateSession requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
        cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     *   a CreateSession request.
     */
    public fun roleArns(vararg roleArns: String) {
        _roleArns.addAll(listOf(*roleArns))
    }

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     *   a CreateSession request.
     */
    public fun roleArns(roleArns: Collection<String>) {
        _roleArns.addAll(roleArns)
    }

    /**
     * @param sessionPolicy A session policy that will applied to the trust boundary of the vended
     *   session credentials.
     */
    public fun sessionPolicy(sessionPolicy: String) {
        cdkBuilder.sessionPolicy(sessionPolicy)
    }

    /** @param tags A list of Tags. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of Tags. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProfileProps {
        if (_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
        if (_roleArns.isNotEmpty()) cdkBuilder.roleArns(_roleArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
