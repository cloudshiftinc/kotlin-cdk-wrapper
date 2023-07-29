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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * The current status of the service software for an Amazon OpenSearch Service domain.
 *
 * For more information, see
 * [Service software updates in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * ServiceSoftwareOptionsProperty serviceSoftwareOptionsProperty =
 * ServiceSoftwareOptionsProperty.builder()
 * .automatedUpdateDate("automatedUpdateDate")
 * .cancellable(false)
 * .currentVersion("currentVersion")
 * .description("description")
 * .newVersion("newVersion")
 * .optionalDeployment(false)
 * .updateAvailable(false)
 * .updateStatus("updateStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html)
 */
@CdkDslMarker
public class CfnDomainServiceSoftwareOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.ServiceSoftwareOptionsProperty.Builder =
        CfnDomain.ServiceSoftwareOptionsProperty.builder()

    /**
     * @param automatedUpdateDate The timestamp, in Epoch time, until which you can manually request
     *   a service software update. After this date, we automatically update your service software.
     */
    public fun automatedUpdateDate(automatedUpdateDate: String) {
        cdkBuilder.automatedUpdateDate(automatedUpdateDate)
    }

    /**
     * @param cancellable True if you're able to cancel your service software version update. False
     *   if you can't cancel your service software update.
     */
    public fun cancellable(cancellable: Boolean) {
        cdkBuilder.cancellable(cancellable)
    }

    /**
     * @param cancellable True if you're able to cancel your service software version update. False
     *   if you can't cancel your service software update.
     */
    public fun cancellable(cancellable: IResolvable) {
        cdkBuilder.cancellable(cancellable)
    }

    /** @param currentVersion The current service software version present on the domain. */
    public fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
    }

    /** @param description A description of the service software update status. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param newVersion The new service software version, if one is available. */
    public fun newVersion(newVersion: String) {
        cdkBuilder.newVersion(newVersion)
    }

    /**
     * @param optionalDeployment True if a service software is never automatically updated. False if
     *   a service software is automatically updated after the automated update date.
     */
    public fun optionalDeployment(optionalDeployment: Boolean) {
        cdkBuilder.optionalDeployment(optionalDeployment)
    }

    /**
     * @param optionalDeployment True if a service software is never automatically updated. False if
     *   a service software is automatically updated after the automated update date.
     */
    public fun optionalDeployment(optionalDeployment: IResolvable) {
        cdkBuilder.optionalDeployment(optionalDeployment)
    }

    /**
     * @param updateAvailable True if you're able to update your service software version. False if
     *   you can't update your service software version.
     */
    public fun updateAvailable(updateAvailable: Boolean) {
        cdkBuilder.updateAvailable(updateAvailable)
    }

    /**
     * @param updateAvailable True if you're able to update your service software version. False if
     *   you can't update your service software version.
     */
    public fun updateAvailable(updateAvailable: IResolvable) {
        cdkBuilder.updateAvailable(updateAvailable)
    }

    /** @param updateStatus The status of your service software update. */
    public fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): CfnDomain.ServiceSoftwareOptionsProperty = cdkBuilder.build()
}
