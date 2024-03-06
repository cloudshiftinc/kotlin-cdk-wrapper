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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * The CIS targets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * CisTargetsProperty cisTargetsProperty = CisTargetsProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .targetResourceTags(Map.of(
 * "targetResourceTagsKey", List.of("targetResourceTags")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-cistargets.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationCisTargetsPropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.CisTargetsProperty.Builder =
        CfnCisScanConfiguration.CisTargetsProperty.builder()

    private val _accountIds: MutableList<String> = mutableListOf()

    /** @param accountIds The CIS target account ids. */
    public fun accountIds(vararg accountIds: String) {
        _accountIds.addAll(listOf(*accountIds))
    }

    /** @param accountIds The CIS target account ids. */
    public fun accountIds(accountIds: Collection<String>) {
        _accountIds.addAll(accountIds)
    }

    /** @param targetResourceTags The CIS target resource tags. */
    public fun targetResourceTags(targetResourceTags: Map<String, List<String>>) {
        cdkBuilder.targetResourceTags(targetResourceTags)
    }

    /** @param targetResourceTags The CIS target resource tags. */
    public fun targetResourceTags(targetResourceTags: IResolvable) {
        cdkBuilder.targetResourceTags(targetResourceTags)
    }

    public fun build(): CfnCisScanConfiguration.CisTargetsProperty {
        if (_accountIds.isNotEmpty()) cdkBuilder.accountIds(_accountIds)
        return cdkBuilder.build()
    }
}
