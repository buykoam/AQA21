package models;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringExclude;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @EqualsAndHashCode.Exclude
    private int id;

    @ToString.Exclude

    private String username;

    @ToString.Exclude
    @With(AccessLevel.PROTECTED)
    private String password;

    @NonNull
    private String username1;

    @NonNull @With(AccessLevel.PROTECTED)
    private String password1;

    @ToString.Exclude
    private String email;

    @ToString.Exclude
    private String code;
}