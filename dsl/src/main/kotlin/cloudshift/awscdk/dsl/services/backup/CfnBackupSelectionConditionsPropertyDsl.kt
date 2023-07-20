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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBackupSelectionConditionsPropertyDsl {
    private val cdkBuilder: CfnBackupSelection.ConditionsProperty.Builder =
        CfnBackupSelection.ConditionsProperty.builder()

    private val _stringEquals: MutableList<Any> = mutableListOf()

    private val _stringLike: MutableList<Any> = mutableListOf()

    private val _stringNotEquals: MutableList<Any> = mutableListOf()

    private val _stringNotLike: MutableList<Any> = mutableListOf()

    public fun stringEquals(vararg stringEquals: Any) {
        _stringEquals.addAll(listOf(*stringEquals))
    }

    public fun stringEquals(stringEquals: Collection<Any>) {
        _stringEquals.addAll(stringEquals)
    }

    public fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals)
    }

    public fun stringLike(vararg stringLike: Any) {
        _stringLike.addAll(listOf(*stringLike))
    }

    public fun stringLike(stringLike: Collection<Any>) {
        _stringLike.addAll(stringLike)
    }

    public fun stringLike(stringLike: IResolvable) {
        cdkBuilder.stringLike(stringLike)
    }

    public fun stringNotEquals(vararg stringNotEquals: Any) {
        _stringNotEquals.addAll(listOf(*stringNotEquals))
    }

    public fun stringNotEquals(stringNotEquals: Collection<Any>) {
        _stringNotEquals.addAll(stringNotEquals)
    }

    public fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals)
    }

    public fun stringNotLike(vararg stringNotLike: Any) {
        _stringNotLike.addAll(listOf(*stringNotLike))
    }

    public fun stringNotLike(stringNotLike: Collection<Any>) {
        _stringNotLike.addAll(stringNotLike)
    }

    public fun stringNotLike(stringNotLike: IResolvable) {
        cdkBuilder.stringNotLike(stringNotLike)
    }

    public fun build(): CfnBackupSelection.ConditionsProperty {
        if (_stringEquals.isNotEmpty()) cdkBuilder.stringEquals(_stringEquals)
        if (_stringLike.isNotEmpty()) cdkBuilder.stringLike(_stringLike)
        if (_stringNotEquals.isNotEmpty()) cdkBuilder.stringNotEquals(_stringNotEquals)
        if (_stringNotLike.isNotEmpty()) cdkBuilder.stringNotLike(_stringNotLike)
        return cdkBuilder.build()
    }
}
