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

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeySpec
import software.amazon.awscdk.services.kms.KeyUsage
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class KeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Key.Builder = Key.Builder.create(scope, id)

    private val _admins: MutableList<IPrincipal> = mutableListOf()

    public fun admins(vararg admins: IPrincipal) {
        _admins.addAll(listOf(*admins))
    }

    public fun admins(admins: Collection<IPrincipal>) {
        _admins.addAll(admins)
    }

    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun keySpec(keySpec: KeySpec) {
        cdkBuilder.keySpec(keySpec)
    }

    public fun keyUsage(keyUsage: KeyUsage) {
        cdkBuilder.keyUsage(keyUsage)
    }

    public fun pendingWindow(pendingWindow: Duration) {
        cdkBuilder.pendingWindow(pendingWindow)
    }

    public fun policy(block: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(block)
        cdkBuilder.policy(builder.build())
    }

    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): Key {
        if (_admins.isNotEmpty()) cdkBuilder.admins(_admins)
        return cdkBuilder.build()
    }
}
