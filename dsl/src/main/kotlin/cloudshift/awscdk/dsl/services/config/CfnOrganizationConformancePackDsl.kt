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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOrganizationConformancePackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOrganizationConformancePack.Builder =
        CfnOrganizationConformancePack.Builder.create(scope, id)

    private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

    private val _excludedAccounts: MutableList<String> = mutableListOf()

    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
        _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
    }

    public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
        _conformancePackInputParameters.addAll(conformancePackInputParameters)
    }

    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
        cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    public fun deliveryS3Bucket(deliveryS3Bucket: String) {
        cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
        cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    public fun excludedAccounts(vararg excludedAccounts: String) {
        _excludedAccounts.addAll(listOf(*excludedAccounts))
    }

    public fun excludedAccounts(excludedAccounts: Collection<String>) {
        _excludedAccounts.addAll(excludedAccounts)
    }

    public fun organizationConformancePackName(organizationConformancePackName: String) {
        cdkBuilder.organizationConformancePackName(organizationConformancePackName)
    }

    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): CfnOrganizationConformancePack {
        if (_conformancePackInputParameters.isNotEmpty()) {
            cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
        }
        if (_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
        return cdkBuilder.build()
    }
}
