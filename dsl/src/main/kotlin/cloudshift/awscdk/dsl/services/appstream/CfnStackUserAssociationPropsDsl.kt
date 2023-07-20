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
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnStackUserAssociationPropsDsl {
    private val cdkBuilder: CfnStackUserAssociationProps.Builder =
        CfnStackUserAssociationProps.builder()

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

    public fun build(): CfnStackUserAssociationProps = cdkBuilder.build()
}
