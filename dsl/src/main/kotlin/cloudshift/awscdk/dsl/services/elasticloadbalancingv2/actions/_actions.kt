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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2.actions

import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
import kotlin.Unit

public object actions {
    public inline fun authenticateCognitoAction(block: AuthenticateCognitoActionDsl.() -> Unit = {}): AuthenticateCognitoAction {
        val builder = AuthenticateCognitoActionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun authenticateCognitoActionProps(block: AuthenticateCognitoActionPropsDsl.() -> Unit = {}): AuthenticateCognitoActionProps {
        val builder = AuthenticateCognitoActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
