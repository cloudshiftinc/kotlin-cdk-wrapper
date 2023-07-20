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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnStackUserAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStackUserAssociation.Builder =
        CfnStackUserAssociation.Builder.create(scope, id)

    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    public fun sendEmailNotification(sendEmailNotification: Boolean) {
        cdkBuilder.sendEmailNotification(sendEmailNotification)
    }

    public fun sendEmailNotification(sendEmailNotification: IResolvable) {
        cdkBuilder.sendEmailNotification(sendEmailNotification)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnStackUserAssociation = cdkBuilder.build()
}
