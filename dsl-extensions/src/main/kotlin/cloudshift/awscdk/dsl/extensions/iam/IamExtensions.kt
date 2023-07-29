package cloudshift.awscdk.dsl.extensions.iam

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.iam.iam
import software.amazon.awscdk.services.iam.Effect
import software.amazon.awscdk.services.iam.PolicyStatement

public fun PolicyStatementDsl.allow() {
    effect(Effect.ALLOW)
}

public fun PolicyStatementDsl.deny() {
    effect(Effect.DENY)
}

public fun PolicyStatementDsl.action(action: String) {
    actions(action)
}

public fun PolicyStatementDsl.resource(arn: String) {
    resources(arn)
}

public fun PolicyStatementDsl.anyResource() {
    resources("*")
}

public fun iam.policyStatements(block: (PolicyStatementsDsl).() -> Unit): List<PolicyStatement> {
    return PolicyStatementsDsl().apply(block).policyStatements
}

public class PolicyStatementsDsl {
    internal val policyStatements = mutableListOf<PolicyStatement>()

    public fun policyStatement(block: PolicyStatementDsl.() -> Unit) {
        policyStatements.add(iam.policyStatement(block))
    }
}
