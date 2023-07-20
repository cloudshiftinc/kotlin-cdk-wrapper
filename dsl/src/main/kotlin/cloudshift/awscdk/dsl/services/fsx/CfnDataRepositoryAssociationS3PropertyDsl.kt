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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

@CdkDslMarker
public class CfnDataRepositoryAssociationS3PropertyDsl {
    private val cdkBuilder: CfnDataRepositoryAssociation.S3Property.Builder =
        CfnDataRepositoryAssociation.S3Property.builder()

    public fun autoExportPolicy(autoExportPolicy: IResolvable) {
        cdkBuilder.autoExportPolicy(autoExportPolicy)
    }

    public fun autoExportPolicy(autoExportPolicy: CfnDataRepositoryAssociation.AutoExportPolicyProperty) {
        cdkBuilder.autoExportPolicy(autoExportPolicy)
    }

    public fun autoImportPolicy(autoImportPolicy: IResolvable) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
    }

    public fun autoImportPolicy(autoImportPolicy: CfnDataRepositoryAssociation.AutoImportPolicyProperty) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
    }

    public fun build(): CfnDataRepositoryAssociation.S3Property = cdkBuilder.build()
}
