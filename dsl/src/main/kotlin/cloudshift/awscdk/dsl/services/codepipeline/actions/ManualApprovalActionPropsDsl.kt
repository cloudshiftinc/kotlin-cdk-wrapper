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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sns.ITopic
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ManualApprovalActionPropsDsl {
    private val cdkBuilder: ManualApprovalActionProps.Builder = ManualApprovalActionProps.builder()

    private val _notifyEmails: MutableList<String> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun additionalInformation(additionalInformation: String) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    public fun externalEntityLink(externalEntityLink: String) {
        cdkBuilder.externalEntityLink(externalEntityLink)
    }

    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    public fun notifyEmails(vararg notifyEmails: String) {
        _notifyEmails.addAll(listOf(*notifyEmails))
    }

    public fun notifyEmails(notifyEmails: Collection<String>) {
        _notifyEmails.addAll(notifyEmails)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): ManualApprovalActionProps {
        if (_notifyEmails.isNotEmpty()) cdkBuilder.notifyEmails(_notifyEmails)
        return cdkBuilder.build()
    }
}
