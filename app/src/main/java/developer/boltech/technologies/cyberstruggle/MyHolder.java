package developer.boltech.technologies.cyberstruggle;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView {

    ImageView imageView;
    TextView name, position;
    public MyHolder(@NonNull Context context) {
        super(context);

        imageView = findViewById(R.id.team_image);
        name = findViewById(R.id.team_name);
        position = findViewById(R.id.team_position);
    }
}
