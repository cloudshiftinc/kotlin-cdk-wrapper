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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

    private val _actions: MutableList<String> = mutableListOf()

    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun sourceAccount(sourceAccount: String) {
        cdkBuilder.sourceAccount(sourceAccount)
    }

    public fun build(): CfnPermission {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
