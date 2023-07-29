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

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
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
     * @param durationSeconds Sets the maximum number of seconds that vended temporary credentials
     *   through
     *   [CreateSession](https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html)
     *   will be valid for, between 900 and 3600.
     */
    public fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
    }

    /** @param enabled Indicates whether the profile is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether the profile is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs that apply to the vended session
     *   credentials.
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs that apply to the vended session
     *   credentials.
     */
    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    /** @param name The name of the profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     *   temporary credential requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: Boolean) {
        cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     *   temporary credential requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
        cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * @param roleArns A list of IAM role ARNs. During `CreateSession` , if a matching role ARN is
     *   provided, the properties in this profile will be applied to the intersection session
     *   policy.
     */
    public fun roleArns(vararg roleArns: String) {
        _roleArns.addAll(listOf(*roleArns))
    }

    /**
     * @param roleArns A list of IAM role ARNs. During `CreateSession` , if a matching role ARN is
     *   provided, the properties in this profile will be applied to the intersection session
     *   policy.
     */
    public fun roleArns(roleArns: Collection<String>) {
        _roleArns.addAll(roleArns)
    }

    /**
     * @param sessionPolicy A session policy that applies to the trust boundary of the vended
     *   session credentials.
     */
    public fun sessionPolicy(sessionPolicy: String) {
        cdkBuilder.sessionPolicy(sessionPolicy)
    }

    /** @param tags The tags to attach to the profile. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to attach to the profile. */
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
