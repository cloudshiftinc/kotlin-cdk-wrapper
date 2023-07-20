@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnRole
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRoleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRole.Builder = CfnRole.Builder.create(scope, id)

    private val _managedPolicyArns: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assumeRolePolicyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.assumeRolePolicyDocument(builder.map)
    }

    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
        cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    public fun maxSessionDuration(maxSessionDuration: Number) {
        cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun permissionsBoundary(permissionsBoundary: String) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRole {
        if (_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
