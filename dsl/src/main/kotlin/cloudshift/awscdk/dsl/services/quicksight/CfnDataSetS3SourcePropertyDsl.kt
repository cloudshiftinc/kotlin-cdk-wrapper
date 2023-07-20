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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetS3SourcePropertyDsl {
    private val cdkBuilder: CfnDataSet.S3SourceProperty.Builder =
        CfnDataSet.S3SourceProperty.builder()

    private val _inputColumns: MutableList<Any> = mutableListOf()

    public fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
    }

    public fun inputColumns(vararg inputColumns: Any) {
        _inputColumns.addAll(listOf(*inputColumns))
    }

    public fun inputColumns(inputColumns: Collection<Any>) {
        _inputColumns.addAll(inputColumns)
    }

    public fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns)
    }

    public fun uploadSettings(uploadSettings: IResolvable) {
        cdkBuilder.uploadSettings(uploadSettings)
    }

    public fun uploadSettings(uploadSettings: CfnDataSet.UploadSettingsProperty) {
        cdkBuilder.uploadSettings(uploadSettings)
    }

    public fun build(): CfnDataSet.S3SourceProperty {
        if (_inputColumns.isNotEmpty()) cdkBuilder.inputColumns(_inputColumns)
        return cdkBuilder.build()
    }
}
