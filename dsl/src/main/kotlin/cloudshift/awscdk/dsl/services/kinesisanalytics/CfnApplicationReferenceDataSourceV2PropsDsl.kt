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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2PropsDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2Props.Builder =
        CfnApplicationReferenceDataSourceV2Props.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun referenceDataSource(referenceDataSource: IResolvable) {
        cdkBuilder.referenceDataSource(referenceDataSource)
    }

    public fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty) {
        cdkBuilder.referenceDataSource(referenceDataSource)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2Props = cdkBuilder.build()
}
