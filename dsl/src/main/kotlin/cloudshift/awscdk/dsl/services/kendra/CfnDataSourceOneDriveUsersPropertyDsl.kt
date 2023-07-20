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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceOneDriveUsersPropertyDsl {
    private val cdkBuilder: CfnDataSource.OneDriveUsersProperty.Builder =
        CfnDataSource.OneDriveUsersProperty.builder()

    private val _oneDriveUserList: MutableList<String> = mutableListOf()

    public fun oneDriveUserList(vararg oneDriveUserList: String) {
        _oneDriveUserList.addAll(listOf(*oneDriveUserList))
    }

    public fun oneDriveUserList(oneDriveUserList: Collection<String>) {
        _oneDriveUserList.addAll(oneDriveUserList)
    }

    public fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path)
    }

    public fun oneDriveUserS3Path(oneDriveUserS3Path: CfnDataSource.S3PathProperty) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path)
    }

    public fun build(): CfnDataSource.OneDriveUsersProperty {
        if (_oneDriveUserList.isNotEmpty()) cdkBuilder.oneDriveUserList(_oneDriveUserList)
        return cdkBuilder.build()
    }
}
